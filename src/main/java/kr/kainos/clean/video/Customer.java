package kr.kainos.clean.video;

import java.util.HashMap;
import java.util.Map;

public class Customer {

  private String title;
  private int days;
  private Map<String, VideoType> movieRegistry = new HashMap<>();

  enum VideoType {
    REGULAR,
    CHILDRENS
  }

  ;

  public Customer() {
    movieRegistry.put("RegularMovie", VideoType.REGULAR);
    movieRegistry.put("ChildrensMovie", VideoType.CHILDRENS);
  }

  public void addRental(String title, int days) {
    this.title = title;
    this.days = days;
  }

  public int getRentalFee() {
    if (getType(title) == VideoType.REGULAR) {
      return applyGracePeriod(150, 3);
    }
    return 100;
  }

  private VideoType getType(String title) {
    return movieRegistry.get(title);
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
