package kr.kainos.clean;

import kr.kainos.clean.application.service.Authenticator;

public class RejectingAuthenticator implements Authenticator {
  @Override
  public Boolean authenticate(String username, String password) {
    return false;  // 항상 인증 실패
  }
}
