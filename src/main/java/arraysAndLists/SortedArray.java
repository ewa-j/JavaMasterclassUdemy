package arraysAndLists;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Comparator.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortedArray {

  private static final Scanner scanner = new Scanner(System.in);

  public int[] getIntegers(int size) {
    int[] intArray = new int[size];
    for (int i=0; i<intArray.length; i++) {
      intArray[i] = scanner.nextInt();
    }
    return intArray;
  }

  public void printArray(int[] array) {
    for (int i=0; i<array.length; i++) {
      System.out.println("Element " + i + " contents " + array[i]);
    }
  }

  public int[] sortIntegers(int[] unsortedArray) {

    Arrays.sort(unsortedArray);
    int[] sortedArray = new int[unsortedArray.length];
    for(int i=0; i<unsortedArray.length; i++){
      sortedArray[unsortedArray.length-1-i] = unsortedArray[i];
    }
    return sortedArray;
  }

}
