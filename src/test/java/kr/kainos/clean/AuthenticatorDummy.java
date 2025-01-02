package kr.kainos.clean;

import kr.kainos.clean.application.service.Authenticator;

public class AuthenticatorDummy implements Authenticator {
  @Override
  public Boolean authenticate(String username, String password) {
    return null;  // 더미 객체는 아무 동작도 하지 않음
  }
}
