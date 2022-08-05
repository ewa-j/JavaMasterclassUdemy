package controlFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputCalculator {

  // Write a method called inputThenPrintSumAndAverage that does not have any parameters.
  //
  //The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
  //
  //When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
  //
  //XX represents the sum of all entered numbers of type int.
  //YY represents the calculated average of all numbers of type long.

  public void inputThenPrintSumAndAverage() {

    Scanner scanner = new Scanner(System.in);

    List<Integer> numbers = new ArrayList<>();
    int counter = 0;

    while (true) {
      if (scanner.hasNextInt()) {
        numbers.add(scanner.nextInt());
        counter++;
      } else {
        break;
      }
    }
    scanner.close();
    int sum = numbers.stream().reduce(0, Integer::sum);
    long avg = Math.round((double) sum / (double) counter);

    if (sum == 0 || counter == 0) {
      System.out.println("SUM = 0 AVG = 0");
    } else {
      System.out.println("SUM = " + sum + " AVG = " + avg);
    }
  }

}
