package com.kanyy.string_calculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

  private StringCalculator sc = new StringCalculator();

  @Test
  public void addNumbersExceptionOnNegativeNumbers() {
    String actuals = "negatives not allowed -3,-5";
    String expecteds = "";
    try {
      sc.add("2\n-3,-5");
    } catch (Exception e) {
      expecteds = e.getMessage();
    }
    Assert.assertEquals(expecteds, actuals);
  }

  @Test
  public void addNumbersWithSupportOfCustomDelimeter() throws Exception {
    int[] expecteds = new int[] {3, 10};
    String[] inputs = new String[] {"//;\n1;2", "2\n3,5"};
    int[] actuals = new int[inputs.length];
    for (int i = 0; i < inputs.length; i++) {
      actuals[i] = sc.add(inputs[i]);
    }
    Assert.assertArrayEquals(expecteds, actuals);
  }

  @Test
  public void addNumbersWithSupportOfNewLineDelimeter() throws Exception {
    int[] expecteds = new int[] {6, 10};
    String[] inputs = new String[] {"5,1", "2\n3,5"};
    int[] actuals = new int[inputs.length];
    for (int i = 0; i < inputs.length; i++) {
      actuals[i] = sc.add(inputs[i]);
    }
    Assert.assertArrayEquals(expecteds, actuals);
  }

  @Test
  public void addUnknownAmountOfNumbers() throws Exception {
    int[] expecteds = new int[] {0, 12, 5};
    String[] inputs = new String[] {"", "5,1,2,4", "2,3,"};
    int[] actuals = new int[inputs.length];
    for (int i = 0; i < inputs.length; i++) {
      actuals[i] = sc.add(inputs[i]);
    }
    Assert.assertArrayEquals(expecteds, actuals);
  }

  @Test
  public void addUptoTwoNumbersWithEmptyString() throws Exception {
    int[] expecteds = new int[] {0, 5, 3, 3};
    String[] inputs = new String[] {"", "5", ",3,", "1,2"};
    int[] actuals = new int[inputs.length];
    for (int i = 0; i < inputs.length; i++) {
      actuals[i] = sc.add(inputs[i]);
    }
    Assert.assertArrayEquals(expecteds, actuals);
  }
}
