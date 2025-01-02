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
    assertWrapped("xxx", 1, "x\nx\nx");
    assertWrapped("xxx", 2, "xx\nx");
    assertWrapped("xxx", 3, "xxx");
    assertWrapped("x x", 1, "x\nx");
    assertWrapped("x x", 2, "x\nx");
    assertWrapped("x x", 3, "x x");
    assertWrapped("x x x", 1, "x\nx\nx");
    assertWrapped("x x x", 2, "x\nx\nx");
    assertWrapped("x x x", 3, "x x\nx");
    assertWrapped("x x x", 4, "x x\nx");
    assertWrapped("x x x", 5, "x x x");
    assertWrapped("xx xx", 1, "x\nx\nx\nx");
    assertWrapped("xx xx", 2, "xx\nxx");
    assertWrapped("xx xx", 3, "xx\nxx");
    assertWrapped("xx xx", 4, "xx\nxx");
    assertWrapped ("xx xx", 5, "xx xx");
    assertWrapped ("xx xx xx", 1, "x\nx\nx\nx\nx\nx");
    assertWrapped ("xx xx xx", 2, "xx\nxx\nxx");
    assertWrapped ("xx xx xx", 3, "xx\nxx\nxx");
    assertWrapped("xx xx xx", 4, "xx\nxx\nxx");
    assertWrapped ("xx xx xx", 5, "xx xx\nxx");
    assertWrapped ("xx xx xx", 6, "xx xx\nxx");
    assertWrapped ("xx xx xx", 7, "xx xx\nxx");
    assertWrapped ("xx xx xx", 8, "xx xx xx");

    String text = "Four score and seven years ago our fathers brought forth upon this continent a new nation conceived in liberty and dedicated to the proposition that all men are created equal";
    System.out.println(wrap(text, 15));
  }

  private void assertWrapped(String s, int width, String expected) {
    assertEquals(expected, wrap(s, width));
  }

  private String wrap(String s, int w) {
    if(w >= s.length()) {
      return s;
    }
    int br = s.lastIndexOf(" ", w);
    if (br == -1) {
      br = w;
    }

    return s.substring(0, br).trim() + "\n" + wrap(s.substring(br).trim(), w);
  }
}
