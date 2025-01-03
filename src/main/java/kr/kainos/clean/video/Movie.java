package kr.kainos.clean.video;

import kr.kainos.clean.video.VideoRegistry.VideoType;

public abstract class Movie {

  public String title;
  private final VideoType videoType;
  public int days;
  public VideoType type;

  public Movie(String title, VideoType videoType, int days) {
    this.title = title;
    this.videoType = videoType;
    this.days = days;
  }

  public String getTitle() {
    return title;
  }

  public VideoType getType() {
    return type;
  }

  public abstract int getFee(int days, Rental rental);

  public abstract int getPoints(int days, Rental rental);

  int applyGracePeriod(int amount, int days, int grace) {
    if (days > grace) {
      return amount + amount * (days - grace);
    }
    return amount;
  }
}