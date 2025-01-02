package kr.kainos.clean;

public class AuthenticatorMock extends AuthenticatorSpy {

  public AuthenticatorMock(String username, String password, int count) {
    super();
  }

  public void setResult(boolean b) {
  }

  public boolean validate() {
    return true;
  }
}
