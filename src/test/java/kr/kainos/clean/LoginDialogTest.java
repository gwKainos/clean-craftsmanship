package kr.kainos.clean;

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
    Authenticator authenticator = new AcceptingAuthenticator();
    LoginDialog dialog = new LoginDialog(authenticator);

    dialog.show();
    boolean success = dialog.submit("admin", "password");

    // 인증 성공이 예상되므로 true를 검증
    assertTrue(success);
  }
}
