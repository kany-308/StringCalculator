package com.kanyy.string_calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

  private String defaultDelimeter = ",|\n";
  private int defaultDelimeterStartIndex = 2;
  private int defaultDelimeterEndEndex = 3;
  private int customDelimeterStartIndex = 4;
  private int maximumNumAllowed = 1000;
  private String exceptionMessage = "negatives not allowed ";

  private int addCount = 0;

  public int add(String numbers) throws Exception {
    addCount++;
    int sum = 0;
    List<String> negativeList = new ArrayList<>();
    String customDelim = defaultDelimeter;
    if (numbers.startsWith("//")) {
      customDelim = numbers.substring(defaultDelimeterStartIndex, defaultDelimeterEndEndex);
      numbers = numbers.substring(customDelimeterStartIndex);
    }
    String[] nums = numbers.split(customDelim);
    for (int i = 0; i < nums.length; i++) {
      if (!nums[i].equals("")) {
        int num = Integer.parseInt(nums[i]);
        if (num > maximumNumAllowed) {
          continue;
        }
        if (num < 0) {
          negativeList.add(nums[i]);
        }
        sum += num;
      }
    }
    if (negativeList.size() > 0) {
      throw new Exception(exceptionMessage + String.join(",", negativeList));
    }
    return sum;
  }

  public int getCalledCount() {
    return addCount;
  }

}
