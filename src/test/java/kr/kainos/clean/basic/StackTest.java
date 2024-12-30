package kr.kainos.clean.basic;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StackTest {
  @Test
  public void canCreateStack() throws Exception {
    Stack stack = new Stack();
    assertTrue(stack.isEmpty());
  }

  @Test
  public void canPush() throws Exception {
    Stack stack = new Stack();
    stack.push(0);
    assertFalse(stack.isEmpty());
  }
}
