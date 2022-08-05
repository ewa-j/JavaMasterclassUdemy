package controlFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinAndMaxUserInput {

//  -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//-Before the user enters the number, print the message ÅgEnter number:Åh
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//-Use an endless while loop.

  public void readNumbers() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number: ");

    List<Integer> numbers = new ArrayList<>();

    while (true) {
      if (scanner.hasNextInt()) {
        numbers.add(scanner.nextInt());
      } else {
        System.out.println("Invalid number, exiting the loop.");
        break;
      }
    }
    Collections.sort(numbers);
    System.out.println("Minimum number: " + numbers.get(0));
    System.out.println("Maximum number: " + numbers.get(numbers.size()-1));
  }

}
