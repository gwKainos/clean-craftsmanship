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
    assertEquals(asList(1, 2, 3), sort(asList(2, 1, 3)));
    assertEquals(asList(1, 2, 3), sort(asList(3, 2, 1)));
    assertEquals(asList(1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 6, 7, 8, 9, 9, 9),
            sort(asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3)));
  }

  private List<Integer> sort(List<Integer> list) {
    if (list.size() > 1) {

      for (int limit = list.size() -1; limit > 0; limit--) {
        for (int firstIndex = 0; firstIndex < limit; firstIndex++) {
          int secondIndex = firstIndex + 1;

          if (list.get(firstIndex) > list.get(secondIndex)) {
            int first = list.get(firstIndex);
            int second = list.get(secondIndex);
            list.set(firstIndex, second);
            list.set(secondIndex, first);
          }
        }
      }
    }
    return list;
  }
}
