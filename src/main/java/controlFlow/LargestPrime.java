package controlFlow;

import java.util.ArrayList;
import java.util.List;

public class LargestPrime {

//  Write a method named getLargestPrime with one parameter of type int named number.
//
//If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.

//  public int getLargestPrime(int number) {
//
//    List<Integer> primes = new ArrayList<>();
//
//    for (int i = 0; i < number; i ++) {
//      if (isPrime(i)) {primes.add(i);}
//    }
//    return  primes.get(primes.size()-1);
//  }
//
//  private boolean isPrime(int number) {
//
//    if (number <=  1) { return false; }
//
//    for (int i = 2; i < Math.sqrt(number); i++) {
//      if (number % i == 0) {
//        return true;
//      }
//    }
//    return false;
//  }

  public static int getLargestPrime(int number) {
    if (number < 2) {
      return -1;
    }
    for (int i = 2; i < number; i++) {
      if ((number % i) == 0) {
        number /= i;
        i--;
      }
    }
    return number;
  }

}
