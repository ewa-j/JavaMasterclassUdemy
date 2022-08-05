package controlFlow;

public class EvenDigitSum {

// Write a method named getEvenDigitSum with one parameter of type int called number.
//
//The method should return the sum of the even digits within the number.
//
//If the number is negative, the method should return -1 to indicate an invalid value.

  public int getEvenDigitSum(int number) {

    if (number < 0) { return -1;}

    int sum = 0;

    while (number > 0) {
      // extract the least significant digit
      int digit = number % 10;
      if (digit % 2 == 0) { sum += digit; }
      // drop the least significant digit
      number /= 10;
    }
    return sum;
  }
}
