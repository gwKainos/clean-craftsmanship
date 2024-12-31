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
    assertThat(factorsOf(4), is(contains(2, 2)));
    assertThat(factorsOf(5), is(contains(5)));
    assertThat(factorsOf(6), is(contains(2, 3)));
    assertThat(factorsOf(7), is(contains(7)));
    assertThat(factorsOf(8), is(contains(2, 2, 2)));
    assertThat(factorsOf(9), is(contains(3, 3)));
  }

  private List<Integer> factorsOf(int n) {
    ArrayList<Integer> factors = new ArrayList<>();

    for (int divisor = 2; n > 1; divisor++) {
      for (; n % divisor == 0; n /= divisor) {
        factors.add(divisor);
      }
    }
    
    return factors;
  }
}
