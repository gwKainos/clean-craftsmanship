package kr.kainos.clean;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class LoginDialogTest {
  @Test
  public void whenClosed_loginIsCancelled() throws Exception {
    Authenticator authenticator = new AuthenticatorDummy();
    LoginDialog dialog = new LoginDialog(authenticator);

    dialog.show();
    boolean success = dialog.sendEvent(Event.CLOSE);
    assertTrue(success);
  }
}
