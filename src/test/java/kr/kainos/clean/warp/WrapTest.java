package kr.kainos.clean.warp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WrapTest {

  @Test
  public void testWrap() throws Exception {
    assertEquals("Four", wrap("Four", 7));
  }

  private String wrap(String s, int w) {
    return null;
  }
}