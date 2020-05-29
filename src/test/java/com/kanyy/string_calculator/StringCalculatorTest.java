package com.kanyy.string_calculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

  private StringCalculator sc = new StringCalculator();

  @Test
  public void addUnknownAmountOfNumbers() {
    int[] expecteds = new int[] {0, 12, 5};
    String[] inputs = new String[] {"", "5,1,2,4", "2,3,"};
    int[] actuals = new int[inputs.length];
    for (int i = 0; i < inputs.length; i++) {
      actuals[i] = sc.add(inputs[i]);
    }
    Assert.assertArrayEquals(expecteds, actuals);
  }

  @Test
  public void addUptoTwoNumbersWithEmptyString() {
    int[] expecteds = new int[] {0, 5, 3, 3};
    String[] inputs = new String[] {"", "5", ",3,", "1,2"};
    int[] actuals = new int[inputs.length];
    for (int i = 0; i < inputs.length; i++) {
      actuals[i] = sc.add(inputs[i]);
    }
    Assert.assertArrayEquals(expecteds, actuals);
  }
}
