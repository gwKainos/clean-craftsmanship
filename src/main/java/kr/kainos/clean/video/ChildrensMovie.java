package kr.kainos.clean.video;

import kr.kainos.clean.video.VideoRegistry.VideoType;

public class ChildrensMovie extends Movie {

  public ChildrensMovie(String title, VideoType videoType) {
    super(title, videoType);
  }

  public int getFee(int days, Rental rental) {
    return days * 100;
  }

  public int getPoints(int days, Rental rental) {
    return 1;
  }
}
