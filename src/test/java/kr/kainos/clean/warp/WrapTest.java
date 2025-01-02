package kr.kainos.clean.warp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WrapTest {

  @Test
  public void testWrap() throws Exception {
    assertWrapped("", 1, "");
    assertWrapped("x", 1, "x");
    assertWrapped("xx", 1, "x\nx");
    assertWrapped("xx", 2, "xx");
    assertWrapped("xxx", 3, "x\nx\nx");
  }

  private void assertWrapped(String s, int width, String expected) {
    assertEquals(expected, wrap(s, width));
  }

  private String wrap(String s, int w) {
    if(w >= s.length()) {
      return s;
    }

    return s.substring(0, w) + "\n" + s.substring(0, w);
  }
}
