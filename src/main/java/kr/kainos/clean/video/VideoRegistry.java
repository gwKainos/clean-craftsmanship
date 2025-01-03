package kr.kainos.clean.video;

import static kr.kainos.clean.video.VideoRegistry.VideoType.CHILDRENS;
import static kr.kainos.clean.video.VideoRegistry.VideoType.REGULAR;

import java.util.HashMap;
import java.util.Map;

public class VideoRegistry {
  public enum VideoType {
    REGULAR,
    CHILDRENS
  }

  public static final Map<String, VideoType> videoRegistry = new HashMap<>();

  public static Movie getMovie(String title) {
    switch (videoRegistry.get(title)) {
      case CHILDRENS:
        return new ChildrensMovie(title, CHILDRENS);
      case REGULAR:
        return new RegularMovie(title, REGULAR);
      default:
        throw new IllegalArgumentException("Invalid Movie Type");
    }
  }

  public static void addMovie(String title, VideoType type) {
    videoRegistry.put(title, type);
  }
}
