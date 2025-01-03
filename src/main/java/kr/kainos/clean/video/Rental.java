package kr.kainos.clean.video;

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
}
