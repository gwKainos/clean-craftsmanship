package kr.kainos.clean.application.ui;

import kr.kainos.clean.application.service.Authenticator;

public class LoginDialog {
  private final Authenticator authenticator;

  public LoginDialog(Authenticator authenticator) {
    this.authenticator = authenticator;
  }

  public void show() {
  }

  public boolean sendEvent(Event event) {
    return true;
  }
}
