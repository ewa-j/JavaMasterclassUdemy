package sortingAlgorithms;

public class BubbleSortArray {

  private final int[] intArray = {20, 35, -15, 7, 55, 1, -22};

  public void bubbleSort() {
    for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
      for (int i = 0; i < lastUnsortedIndex; i++) {
        if (intArray[i] > intArray[i+1]) {
          Swap.swap(intArray, i, i+1);
        }
      }
    }
  }

}
