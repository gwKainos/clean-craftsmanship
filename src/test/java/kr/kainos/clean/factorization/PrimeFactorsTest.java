package kr.kainos.clean.factorization;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyCollectionOf;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {
  @Test
  public void factors() throws Exception {
    assertThat(factorsOf(1), is(emptyCollectionOf(Integer.class)));
  }

  private List<Integer> factorsOf(int n) {
    return new ArrayList<>();
  }
}
