package sortingAlgorithms;

public class ShellSort {

  private final int[] intArray = {20, 35, -15, 7, 55, 1, -22};

  public void shellSort() {

     for (int gap = intArray.length/2; gap > 0; gap /= 2) {

       for (int i = gap; i < intArray.length; i++) {
         int newElement = intArray[i];

         int j = i;

         while (j >= gap && intArray[j - gap] > newElement) {
           intArray[j] = intArray[j-gap];
           j -= gap;
         }

         intArray[j] = newElement;
       }
     }

  }

}
