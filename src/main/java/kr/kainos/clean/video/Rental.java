package kr.kainos.clean.video;

public class Rental {
  private int days;
  private Movie movie;

  public Rental(String title, int days) {
    this.days = days;
    movie = VideoRegistry.getMovie(title, days);
  }

  int getFee() {
    return movie.getFee(days, this);
  }

  int getPoints() {
    return movie.getPoints(days, this);
  }
}
