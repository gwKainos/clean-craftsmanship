package kr.kainos.clean.video;

import static kr.kainos.clean.video.VideoRegistry.VideoType.CHILDRENS;
import static kr.kainos.clean.video.VideoRegistry.VideoType.REGULAR;
import static kr.kainos.clean.video.VideoRegistry.videoRegistry;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private List<Rental> rentals = new ArrayList<>();

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
      fee += rental.getFee();
    }
    return fee;
  }

  public int getRenterPoints() {
    int points = 0;
    for (Rental rental : rentals) {
      points += rental.getPoints();
    }

    return points;
  }
}
