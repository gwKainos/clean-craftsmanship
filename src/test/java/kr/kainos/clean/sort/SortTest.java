package kr.kainos.clean.sort;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class SortTest {

  @Test
  public void sorted() throws Exception {
    assertEquals(List.of(), sort(List.of()));
    assertEquals(List.of(1), sort(List.of(1)));
    assertEquals(asList(1, 2), sort(asList(1, 2)));
    assertEquals(asList(1, 2), sort(asList(2, 1)));
  }

  private List<Integer> sort(List<Integer> list) {
    return list;
  }
}
