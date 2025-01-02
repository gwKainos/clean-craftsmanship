package kr.kainos.clean;

import kr.kainos.clean.application.service.Authenticator;

public class PromiscuousAuthenticator implements Authenticator {
  @Override
  public Boolean authenticate(String username, String password) {
    return true;  // 항상 인증 성공
  }
}
