package kr.kainos.clean.video;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {
  private Customer customer;

  @BeforeEach
  public void setUp() throws Exception {
    customer = new Customer();
  }

  private void assertFeeAndPoints(double fee, int points) {
    assertEquals(fee, customer.getRentalFee(), 0.001);
    assertEquals(points, customer.getRenterPoints());
  }

  @Test
  public void RegularMovie_OneDay() throws Exception {
    customer.addRental("RegularMovie", 1);
    assertFeeAndPoints(150, 1);
  }

  @Test
  public void RegularMovie_SecondAndThirdDayFree() throws Exception {
    customer.addRental("RegularMovie", 2);
    assertFeeAndPoints(150, 1);
    customer.addRental("RegularMovie", 3);
    assertFeeAndPoints(150, 1);
  }

  @Test
  public void RegularMovie_FourDays() throws Exception {
    customer.addRental("RegularMovie", 4);
    assertFeeAndPoints(300, 2);
  }

  @Test
  public void ChildrensMovie_OneDay() throws Exception {
    customer.addRental("ChildrensMovie", 1);
    assertFeeAndPoints(100, 1);
  }
}
