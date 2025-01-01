package kr.kainos.clean.sort;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
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
    assertEquals(asList(1, 2, 3, 4), sort(asList(1, 2, 3, 4)));
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
    int middle = list.get(0);

    List<Integer> lessers =
            list.stream().filter(x -> x < middle).collect(toList());
    List<Integer> greaters =
            list.stream().filter(x -> x > middle).collect(toList());

    List<Integer> result = new ArrayList<>();
    result.addAll(sort(lessers));
    result.add(middle);
    result.addAll(sort(greaters));

    return result;
  }
}
