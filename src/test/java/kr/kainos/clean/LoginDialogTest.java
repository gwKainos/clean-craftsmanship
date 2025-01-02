package kr.kainos.clean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import kr.kainos.clean.application.service.Authenticator;
import kr.kainos.clean.application.ui.Event;
import kr.kainos.clean.application.ui.LoginDialog;
import org.junit.jupiter.api.Test;

public class LoginDialogTest {

  private static Authenticator getAuthenticator() {
    Authenticator authenticator = new AuthenticatorDummy();
    return authenticator;
  }

  @Test
  public void whenClosed_loginIsCancelled() throws Exception {
    Authenticator authenticator = getAuthenticator();
    LoginDialog dialog = new LoginDialog(authenticator);

    dialog.show();
    boolean success = dialog.sendEvent(Event.CLOSE);
    assertTrue(success);
  }

  @Test
  public void whenAuthenticatorRejects_loginFails() throws Exception {
    Authenticator authenticator = new RejectingAuthenticator();
    LoginDialog dialog = new LoginDialog(authenticator);
    dialog.show();
    boolean success = dialog.submit("bad username", "bad password");
    assertFalse(success);
  }

  @Test
  public void whenAuthenticatorAccepts_loginSucceeds() throws Exception {
    Authenticator authenticator = new PromiscuousAuthenticator();
    LoginDialog dialog = new LoginDialog(authenticator);

    dialog.show();
    boolean success = dialog.submit("good username", "good password");

    // 인증 성공이 예상되므로 true를 검증
    assertTrue(success);
  }

  @Test
  public void loginDialog_correctlyInvokesAuthenticator() throws Exception {
    AuthenticatorSpy spy = new AuthenticatorSpy();
    LoginDialog dialog = new LoginDialog(spy);
    spy.setResult(true);  // 결과를 true로 설정
    dialog.show();
    boolean success = dialog.submit("user", "pw");

    assertTrue(success);  // 성공 여부 검증
    assertEquals(1, spy.getCount());  // 호출 횟수 검증
    assertEquals("user", spy.getLastUsername());  // 마지막 호출된 사용자명 검증
    assertEquals("pw", spy.getLastPassword());  // 마지막 호출된 비밀번호 검증
  }

  @Test
  public void loginDialogCallToAuthenticator_validated() throws Exception {
    AuthenticatorMock mock = new AuthenticatorMock("Bob", "xyzzy", 1);  // 오타 수정
    LoginDialog dialog = new LoginDialog(mock);
    mock.setResult(true);
    dialog.show();
    boolean success = dialog.submit("Bob", "xyzzy");
    assertTrue(success);
    assertTrue(mock.validate());
  }

  @Test
  public void badPasswordAttempt_loginFails() throws Exception {
    Authenticator authenticator = new FakeAuthenticator();
    LoginDialog dialog = new LoginDialog(authenticator);
    dialog.show();
    boolean success = dialog.submit("user", "bad password");
    assertFalse(success);
  }

  @Test
  public void goodPasswordAttempt_loginSucceeds() throws Exception {
    Authenticator authenticator = new FakeAuthenticator();
    LoginDialog dialog = new LoginDialog(authenticator);
    dialog.show();
    boolean success = dialog.submit("user", "good password");
    assertTrue(success);
  }
}
