package kr.kainos.clean.video;

import org.junit.jupiter.api.Test;

public class CustomerTest {
  @Test
  public void RegularMovie_OneDay() throws Exception {
    Customer c = new Customer();
    c.addRental("RegularMovie", 1);
    assertEquals(1.5, c.getRentalFee(), 0.001);
    assertEquals(1, c.getRenterPoints());
  }
}
