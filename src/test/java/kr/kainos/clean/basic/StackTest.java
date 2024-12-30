package kr.kainos.clean.basic;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    assertEquals(1, stack.getSize());
  }

  @Test
  public void afterOnePushAndOnePop_isEmpty() throws Exception {
    stack.push(0);
    stack.pop();
    assertTrue(stack.isEmpty());
    assertEquals(0, stack.getSize());
  }

  @Test
  public void afterTwoPushes_sizeIsTwo() throws Exception {
    stack.push(0);
    stack.push(0);
    assertEquals(2, stack.getSize());
  }

  @Test
  public void poppingEmptyStack_throwsUnderflow() {
    assertThrows(Stack.Underflow.class, () -> {
      stack.pop();
    });
  }

  @Test
  public void afterPushingX_willPopX() throws Exception {
    stack.push(99);
    assertEquals(99, stack.pop());
    stack.push(88);
    assertEquals(88, stack.pop());
  }

  @Test
  public void afterPushingXandY_willPopYthenX() throws Exception {
    stack.push(99);
    stack.push(88);
    assertEquals(99, stack.pop());
    assertEquals(88, stack.pop());
  }
}
