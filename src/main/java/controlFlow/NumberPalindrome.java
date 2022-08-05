package controlFlow;

import static java.lang.Math.abs;

import java.util.Objects;

public class NumberPalindrome {

//  Write a method called isPalindrome with one int parameter called number.
//
//The method needs to return a boolean.
//
//It should return true if the number is a palindrome number otherwise it should return false.

  public boolean isPalindrome(int number) {

    String reversedNumberString = new StringBuilder(String.valueOf(abs(number))).reverse().toString();
    if (Objects.equals(String.valueOf(abs(number)), reversedNumberString)) {
      return true;
    } else {
      return false;
    }
  }
}
