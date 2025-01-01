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
    assertEquals(asList(1, 2, 3), sort(asList(1, 2, 3)));
  }

  private List<Integer> sort(List<Integer> list) {
    if (list.size() <= 1) {
      return list;
    }

    if (list.size() == 2) {
      int first = list.get(0);
      int second = list.get(1);
      if (first > second) {
        return asList(second, first);
      }

      return asList(first, second);
    }

    return list;
  }
}
