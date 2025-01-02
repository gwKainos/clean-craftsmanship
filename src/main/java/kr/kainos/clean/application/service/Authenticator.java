package kr.kainos.clean.application.service;

public interface Authenticator {
  Boolean authenticate(String username, String password);
}
