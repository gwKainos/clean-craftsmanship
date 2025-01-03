package kr.kainos.clean.video;

import java.util.HashMap;
import java.util.Map;

public class VideoRegistry {
  public enum VideoType {
    REGULAR,
    CHILDRENS
  }

  public static final Map<String, VideoType> videoRegistry = new HashMap<>();

  public static VideoType getType(String title) {
    return videoRegistry.get(title);
  }

  public static void addMovie(String title, VideoType type) {
    videoRegistry.put(title, type);
  }
}
