package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sizeOfArray = in.nextInt();

    int[] array = new int[sizeOfArray];
    for (int i = 0; i < array.length; i++) {
      array[i] = in.nextInt();
    }

    reverseTheArray(array);
    System.out.println(Arrays.toString(array));
  }

  static void reverseTheArray(int[] array) {
    int start = 0;
    int end = array.length - 1;
    for (int i = start; i <= end; i++) {
      if (start < end) {
        swap(array, start, end);
        start++;
        end--;
      }
    }
  }

  static void swap(int[] array, int start, int end) {
    int temp = 0;
    temp = array[start];
    array[start] = array[end];
    array[end] = temp;
  }


}
