package kr.kainos.clean.bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingTest {

  private Game g;

  @BeforeEach
  public void setUp() throws Exception {
    g = new Game();
  }

  @Test
  public void gutterGame() throws Exception {
    rollMany(20, 0);
    assertEquals(0, g.score());
  }

  private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++) {
      g.roll(pins);
    }
  }

  @Test
  public void allOnes() throws Exception {
    rollMany(20, 1);
    assertEquals(20, g.score());
  }

  @Test
  public void oneSpare() throws Exception {
    rollSpare();
    g.roll(7);
    rollMany(17, 0);
    assertEquals(24, g.score());
  }

  private void rollSpare() {
    rollMany(2, 5);
  }
}
