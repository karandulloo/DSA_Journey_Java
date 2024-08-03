package Sorting;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] array = {5, 4, 3, 2, 1};
    bubble(array);
    System.out.println(Arrays.toString(array));

  }

  static void bubble(int[] array) {
    boolean isSwapped;
    for (int i = 0; i < array.length - 1; i++) {
      isSwapped = false;
      for (int j = 1; j < array.length - i; j++) {
        if (array[j] < array[j - 1]) {
          //swap
          int temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
          isSwapped = true;//to check if for the first loop has no dissimilarity then don't run it again
        }

      }
      if (!isSwapped) {
        break;
      }
    }


  }

}
