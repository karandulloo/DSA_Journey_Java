package Arrays;

import java.util.Scanner;

public class MaxValueInArray {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int sizeofArray = in.nextInt();
    int[] array = new int[sizeofArray];
    for (int i = 0; i < array.length; i++) {
      array[i] = in.nextInt();

    }
    int maxValue = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > maxValue) {
        maxValue = array[i];
      }

    }
    System.out.println(maxValue);
  }
}
