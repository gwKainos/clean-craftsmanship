package kr.kainos.clean.video;

import static kr.kainos.clean.video.VideoRegistry.VideoType.CHILDRENS;
import static kr.kainos.clean.video.VideoRegistry.VideoType.REGULAR;
import static kr.kainos.clean.video.VideoRegistry.videoRegistry;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private List<Rental> rentals = new ArrayList<>();
  private String title;
  private int days;;

  public Customer() {
    videoRegistry.put("RegularMovie", REGULAR);
    videoRegistry.put("ChildrensMovie", CHILDRENS);
  }

  public void addRental(String title, int days) {
    rentals.add(new Rental(title, days));
  }

  public int getRentalFee() {
    int fee = 0;
    for (Rental rental : rentals) {
      if (rental.type == REGULAR) {
        fee += applyGracePeriod(150, rental.days, 3);
      } else {
        fee += rental.days * 100;
      }
    }
    return fee;
  }

  public int getRenterPoints() {
    int points = 0;
    for (Rental rental : rentals) {
      if (rental.type == REGULAR) {
        points += applyGracePeriod(1, rental.days, 3);
      } else {
        points++;
      }
    }

    return points;
  }

  private int applyGracePeriod(int amount, int days, int grace) {
    if (days > grace) {
      return amount + amount * (days - grace);
    }
    return amount;
  }
}
