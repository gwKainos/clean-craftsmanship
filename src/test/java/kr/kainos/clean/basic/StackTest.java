package kr.kainos.clean.basic;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class StackTest {
  @Test
  public void canCreateStack() throws Exception {
    Stack stack = new Stack();
    assertFalse(stack.isEmpty());
  }
}
