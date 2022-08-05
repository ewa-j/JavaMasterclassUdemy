package controlFlow;

import java.util.stream.IntStream;

public class SharedDigit {

//  Write a method named hasSharedDigit with two parameters of type int.
//
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

  public boolean hasSharedDigit(int x, int y) {

    if (x < 10 || y < 10 || x > 99 || y > 99) {
      return false;
    }

    int[] xDigits = String.valueOf(x).chars().map(Character::getNumericValue).toArray();
    int[] yDigits = String.valueOf(y).chars().map(Character::getNumericValue).toArray();

    for (int digit : xDigits) {
        return IntStream.of(yDigits).anyMatch(i -> i == digit);
    }
    return false;
  }

  public boolean hasSharedDigitsSecondSolution(int number1, int number2) {
    int sum = 0;
    int sum2 = 0;
    int value2 = 0;
    int value = 0;
    if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
      while ((number1 > 0) && (number2 > 0)) {
        sum += value;
        value = number1 % 10;
        number1 /= 10;
        sum2 = value2;
        value2 = number2 % 10;
        number2 /= 10;
      }
      if (sum == sum2 || sum == value2 || value == sum2 || value == value2) {
        return true;
      }
    }
    return false;
  }
}
