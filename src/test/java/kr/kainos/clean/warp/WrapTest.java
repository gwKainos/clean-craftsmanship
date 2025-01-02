package kr.kainos.clean.warp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WrapTest {

  @Test
  public void testWrap() throws Exception {
    assertWrapped("", 1, "");
  }

  private void assertWrapped(String s, int width, String expected) {
    assertEquals(expected, wrap(s, width));
  }

  private String wrap(String s, int w) {
    return s.replace(" ", "\n");
  }
}
