package kr.kainos.clean.video;

import kr.kainos.clean.video.VideoRegistry.VideoType;

public class RegularMovie extends Movie {

  public RegularMovie(String title, VideoType videoType) {
    super(title, videoType);
  }

  public int getFee(int days, Rental rental) {
    return applyGracePeriod(150, this.days, 3);
  }

  public int getPoints(int days, Rental rental) {
    return applyGracePeriod(1, this.days, 3);
  }
}
