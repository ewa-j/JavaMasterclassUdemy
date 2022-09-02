package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a method called readInteger() that has no parameters and returns an int.
//It needs to read in an integer from the user - this represents how many elements the user needs to enter.
//Write another method called readElements() that has one parameter of type int
//The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
//And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
public class MinimumElement {

  public int readInteger() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }

  public int[] readElements(int length) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[length];
    for(int i = 0; i<array.length; i++){
      array[i] = scanner.nextInt();
      scanner.nextLine();
    }
    return array;
  }

  public int findMin(int[] array) {
    return Arrays.stream(array).min().orElse(-1);
  }
}
