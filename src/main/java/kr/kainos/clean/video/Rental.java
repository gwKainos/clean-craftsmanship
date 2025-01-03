package kr.kainos.clean.video;

public class Rental {
  private int days;
  private Movie movie = new Movie();

  public Rental(String title, int days) {
    this.days = days;
    movie = VideoRegistry.getMovie(title);
  }

  int getPoints() {
    return movie.getPoints();
  }

  int getFee() {
    return movie.getFee();
  }
}
