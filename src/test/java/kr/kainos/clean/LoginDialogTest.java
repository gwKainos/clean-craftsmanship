package kr.kainos.clean;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import kr.kainos.clean.application.service.Authenticator;
import kr.kainos.clean.application.ui.Event;
import kr.kainos.clean.application.ui.LoginDialog;
import org.junit.jupiter.api.Test;

public class LoginDialogTest {
  @Test
  public void whenClosed_loginIsCancelled() throws Exception {
    Authenticator authenticator = getAuthenticator();
    LoginDialog dialog = new LoginDialog(authenticator);

    dialog.show();
    boolean success = dialog.sendEvent(Event.CLOSE);
    assertTrue(success);
  }

  private static Authenticator getAuthenticator() {
    Authenticator authenticator = new AuthenticatorDummy();
    return authenticator;
  }
}
