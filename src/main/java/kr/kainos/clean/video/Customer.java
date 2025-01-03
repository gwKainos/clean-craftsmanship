package kr.kainos.clean.video;

public class Customer {

  private int days;

  public void addRental(String title, int days) {
    this.days = days;
  }

  public int getRentalFee() {
    return applyGracePeriod(150, 3);
  }

  public int getRenterPoints() {
    return applyGracePeriod(1, 3);
  }

  private int applyGracePeriod(int amount, int grace) {
    if (days > grace) {
      return amount + amount * (days - grace);
    }
    return amount;
  }
}
