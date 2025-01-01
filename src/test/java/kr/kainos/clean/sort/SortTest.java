package kr.kainos.clean.sort;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class SortTest {

  @Test
  public void sorted() throws Exception {
    assertEquals(asList(), sort(asList()));
    assertEquals(asList(1), sort(asList(1)));
    assertEquals(asList(1, 2), sort(asList(1, 2)));
    assertEquals(asList(1, 2), sort(asList(2, 1)));
  }

  private List<Integer> sort(List<Integer> list) {
    if (list.size() > 1) {
      if (list.get(0) > list.get(1)) {
        int first = list.get(0);
        int second = list.get(1);
        list.set(0, second);
        list.set(1, first);
      }
    }
    return list;
  }
}
