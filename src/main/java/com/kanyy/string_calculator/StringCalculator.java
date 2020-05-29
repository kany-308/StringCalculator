package com.kanyy.string_calculator;

public class StringCalculator {
  public int add(String numbers) {
    int sum = 0;
    String[] nums = numbers.split(",");
    for (int i = 0; i < nums.length; i++) {
      if (!nums[i].equals("")) {
        sum += Integer.parseInt(nums[i]);
      }
    }
    return sum;
  }

}
