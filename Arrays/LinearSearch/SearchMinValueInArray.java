package Arrays.LinearSearch;

import java.util.Scanner;

public class SearchMinValueInArray {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sizeofArray = in.nextInt();
    int[] array = new int[sizeofArray];

    for (int i = 0; i < array.length; i++) {
      array[i] = in.nextInt();
    }

    System.out.println(findMinValue(array));
  }

  static int findMinValue(int[] array) {
    int pointer = array[0];
    for (int i = 1; i < array.length; i++) {
      if (pointer > array[i]) {
        pointer = array[i];
      }
    }
    return pointer;
  }


}
