package kr.kainos.clean.factorization;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyCollectionOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.contains;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {
  @Test
  public void factors() throws Exception {
    assertThat(factorsOf(1), is(emptyCollectionOf(Integer.class)));
    assertThat(factorsOf(2), is(contains(2)));
    assertThat(factorsOf(3), is(contains(3)));
  }

  private List<Integer> factorsOf(int n) {
    ArrayList<Integer> factors = new ArrayList<>();
    if(n > 1) {
      factors.add(n);
    }
    return factors;
  }
}
