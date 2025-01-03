package kr.kainos.clean.video;

import static kr.kainos.clean.video.VideoRegistry.VideoType.CHILDRENS;
import static kr.kainos.clean.video.VideoRegistry.VideoType.REGULAR;
import static kr.kainos.clean.video.VideoRegistry.videoRegistry;

public class Customer {
  private String title;
  private int days;;

  public Customer() {
    videoRegistry.put("RegularMovie", REGULAR);
    videoRegistry.put("ChildrensMovie", CHILDRENS);
  }

  public void addRental(String title, int days) {
    this.title = title;
    this.days = days;
  }

  public int getRentalFee() {
    if (VideoRegistry.getType(title) == REGULAR) {
      return applyGracePeriod(150, 3);
    }
    return 100;
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
