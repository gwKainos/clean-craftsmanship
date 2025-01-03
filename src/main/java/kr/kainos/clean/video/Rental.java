package kr.kainos.clean.video;

public class Rental {

  public final Movie movie = new Movie();

  public Rental(String title, int days) {
    this.movie.title = title;
    this.movie.days = days;
    movie.type = VideoRegistry.getType(title);
  }

  int getPoints() {
    return movie.getPoints();
  }

  int getFee() {
    return movie.getFee();
  }
}
