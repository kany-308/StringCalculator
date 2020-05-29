package com.kanyy.string_calculator;

public class StringCalculator {

  private String defaultDelimeter = ",|\n";
  private int defaultDelimeterStartIndex = 2;
  private int defaultDelimeterEndEndex = 3;
  private int customDelimeterStartIndex = 4;

  public int add(String numbers) {
    int sum = 0;
    String customDelim = defaultDelimeter;
    if (numbers.startsWith("//")) {
      customDelim = numbers.substring(defaultDelimeterStartIndex, defaultDelimeterEndEndex);
      numbers = numbers.substring(customDelimeterStartIndex);
    }
    String[] nums = numbers.split(customDelim);
    for (int i = 0; i < nums.length; i++) {
      if (!nums[i].equals("")) {
        sum += Integer.parseInt(nums[i]);
      }
    }
    return sum;
  }

}
