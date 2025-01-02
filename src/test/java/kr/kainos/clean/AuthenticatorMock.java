package kr.kainos.clean;

public class AuthenticatorMock extends AuthenticatorSpy {

  private String expectedUsername;
  private String expectedPassword;
  private int expectedCount;

  public AuthenticatorMock(String username, String password, int count) {
    expectedUsername = username;
    expectedPassword = password;
    expectedCount = count;
  }

  public boolean validate() {
    return getCount() == expectedCount &&
            getLastUsername().equals(expectedUsername) &&  // getLastPassword -> getLastUsername 수정
            getLastPassword().equals(expectedPassword);
  }
}
