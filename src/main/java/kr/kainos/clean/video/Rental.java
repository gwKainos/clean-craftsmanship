package kr.kainos.clean.video;

import static kr.kainos.clean.video.VideoRegistry.VideoType.REGULAR;

import kr.kainos.clean.video.VideoRegistry.VideoType;

public class Rental {
  public String title;
  public int days;
  public VideoType type;

  public Rental(String title, int days) {
    this.title = title;
    this.days = days;
    type = VideoRegistry.getType(title);
  }

  public String getTitle() {
    return title;
  }

  public VideoType getType() {
    return type;
  }

  int getPoints(Customer customer) {
    int points = 0;
    if (type == REGULAR) {
      points += applyGracePeriod(1, this.days, 3);
    } else {
      points++;
    }
    return points;
  }

  int getFee(Customer customer) {
    int fee = 0;
    if (type == REGULAR) {
      fee += applyGracePeriod(150, this.days, 3);
    } else {
      fee += this.days * 100;
    }
    return fee;
  }

  private int applyGracePeriod(int amount, int days, int grace) {
    if (days > grace) {
      return amount + amount * (days - grace);
    }
    return amount;
  }
}
