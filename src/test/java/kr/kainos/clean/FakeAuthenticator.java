package kr.kainos.clean;

import kr.kainos.clean.application.service.Authenticator;

public class FakeAuthenticator implements Authenticator {
  @Override
  public Boolean authenticate(String username, String password) {
    return (username.equals("user") && password.equals("good password"));
  }
}
