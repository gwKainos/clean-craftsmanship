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

  public boolean submit(String username, String password) {
    // Authenticator를 사용해 사용자 인증
    Boolean isAuthenticated = authenticator.authenticate(username, password);

    // 인증 결과를 확인하고 반환 (null일 경우 실패 처리)
    return isAuthenticated != null && isAuthenticated;
  }
}
