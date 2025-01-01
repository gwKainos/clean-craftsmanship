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
    assertEquals(asList(1, 2, 3, 4), sort(asList(4, 2, 3, 1)));
    assertEquals(asList(1, 2, 3, 4), sort(asList(2, 1, 3, 4)));
    assertEquals(asList(1, 2, 3, 4), sort(asList(4, 3, 2, 1)));
    assertEquals(asList(1, 1, 2, 3), sort(asList(1, 3, 1, 2)));
  }

  private List<Integer> sort(List<Integer> list) {
    List<Integer> result = new ArrayList<>();

    if (list.isEmpty()) {
      return result;
    }

    int middle = list.get(0);
    List<Integer> middles =
            list.stream().filter(x -> x == middle).collect(toList());
    List<Integer> lessers =
            list.stream().filter(x -> x < middle).collect(toList());
    List<Integer> greaters =
            list.stream().filter(x -> x > middle).collect(toList());

    result.addAll(sort(lessers));
    result.addAll(middles);
    result.addAll(sort(greaters));
    return result;
  }
}
