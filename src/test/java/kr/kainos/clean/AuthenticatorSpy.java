package kr.kainos.clean;

import kr.kainos.clean.application.service.Authenticator;

public class AuthenticatorSpy implements Authenticator {

  private int callCount = 0;
  private boolean result = false;
  private String lastUsername = null;
  private String lastPassword = null;

  public Boolean authenticate(String username, String password) {
    callCount++;
    lastUsername = username;
    lastPassword = password;
    return result;  // 미리 설정된 결과 반환
  }

  public void setResult(boolean result) {
    this.result = result;
  }

  public int getCount() {
    return callCount;
  }

  public String getLastUsername() {
    return lastUsername;
  }

  public String getLastPassword() {
    return lastPassword;
  }
}
