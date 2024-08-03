package Sorting;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] array = {3, 5, 6, 1, 4};
    selectionSort(array);
    System.out.println(Arrays.toString(array));

  }

  static void selectionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      //find the maximum number and swap it with the correct index
      int end = array.length - 1 - i;
      int maxIndex = getMaxIndex(array, 0, end);
      swap(array, maxIndex, end);

    }
    //got the maximum number
  }

  static void swap(int[] array, int start, int end) {
    int temp = array[start];
    array[start] = array[end];
    array[end] = temp;
  }

  static int getMaxIndex(int[] array, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
      if (array[max] < array[i]) {
        max = i;
      }
    }
    return max;
  }

}
