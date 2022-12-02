package sortingAlgorithms;

public class SelectionSort {

  private final int[] intArray = {20, 35, -15, 7, 55, 1, -22};

  public void selectionSort() {

//    increases sorted partition by one
    for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

      int largest = 0;

//       looks for the largest element
      for (int i = 1; i <= lastUnsortedIndex; i++) {

        if (intArray[i] > intArray[largest]) {
          largest = i;
        }
      }

//      swaps the largest element with the last element in the unsorted partition
      Swap.swap(intArray, largest, lastUnsortedIndex);
    }
  }
}
