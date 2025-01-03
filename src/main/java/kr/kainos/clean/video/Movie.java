package kr.kainos.clean.video;

import static kr.kainos.clean.video.VideoRegistry.VideoType.REGULAR;

import kr.kainos.clean.video.VideoRegistry.VideoType;

public class Movie {

  public String title;
  public int days;
  public VideoType type;

  public Movie() {
  }

  public String getTitle() {
    return title;
  }

  public VideoType getType() {
    return type;
  }

  int getPoints() {
    int points = 0;
    if (type == REGULAR) {
      points += applyGracePeriod(1, this.days, 3);
    } else {
      points++;
    }
    return points;
  }

  int getFee() {
    int fee = 0;
    if (type == REGULAR) {
      fee += applyGracePeriod(150, this.days, 3);
    } else {
      fee += this.days * 100;
    }
    return fee;
  }

  int applyGracePeriod(int amount, int days, int grace) {
    if (days > grace) {
      return amount + amount * (days - grace);
    }
    return amount;
  }
}