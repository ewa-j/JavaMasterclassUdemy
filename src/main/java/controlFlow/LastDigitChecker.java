package controlFlow;

public class LastDigitChecker {

//  Write a method named hasSameLastDigit with three parameters of type int.
//
//Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
//
//The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

  public static boolean hasSameLastDigit(int x, int y, int z) {

    if (!isValid(x) || !isValid(y) || !isValid(z)) { return false; }

    int xLastDigit = x % 10;
    int yLastDigit = y % 10;
    int zLastDigit = z % 10;

    return xLastDigit == yLastDigit || xLastDigit == zLastDigit || yLastDigit == zLastDigit;
  }

//  Write another method named isValid with one parameter of type int.
//
//The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

  public static boolean isValid(int number) {
    return number >= 10 && number <= 1000;
  }
}
