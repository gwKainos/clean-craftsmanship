package kr.kainos.clean.basic;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StackTest {
  private Stack stack = new Stack();

  @Test
  public void canCreateStack() throws Exception {
    assertTrue(stack.isEmpty());
  }

  @Test
  public void afterOnePush_isNotEmpty() throws Exception {
    stack.push(0);
    assertFalse(stack.isEmpty());
  }

  @Test
  public void afterOnePushAndOnePop_isEmpty() throws Exception {
    stack.push(0);
    stack.pop(0);
  }
}
