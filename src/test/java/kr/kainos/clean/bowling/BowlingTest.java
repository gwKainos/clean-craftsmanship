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
    rollMany(0);
    assertEquals(0, g.score());
  }

  private void rollMany(int pins) {
    for (int i = 0; i < 20; i++) {
      g.roll(pins);
    }
  }

  @Test
  public void allOnes() throws Exception {
    rollMany(1);
    assertEquals(20, g.score());
  }
}
