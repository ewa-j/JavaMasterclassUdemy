package controlFlow;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {

//  Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//
//If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//
//The method should return the greatest common divisor of the two numbers (int).
//
//The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).

  public int getGreatestCommonDivisor(int first, int second) {

    if (first < 10 || second < 10) { return -1; }

    List<Integer> firstDivisors = new ArrayList<>();
    List<Integer> secondDivisors = new ArrayList<>();
    List<Integer> commonDivisors = new ArrayList<>();

    for (int i = 1; i <= first; i++) {
      if (first % i == 0 ) { firstDivisors.add(i); }
    }

    for (int i = 1; i <= second; i++) {
      if (second % i == 0 ) { secondDivisors.add(i); }
    }

    for (int firstDivisor : firstDivisors) {
      if (secondDivisors.contains(firstDivisor)) {
        commonDivisors.add(firstDivisor);
      }
    }

    System.out.println(firstDivisors);
    System.out.println(secondDivisors);
    System.out.println(commonDivisors);
    return commonDivisors.get(commonDivisors.size()-1);
  }
}
