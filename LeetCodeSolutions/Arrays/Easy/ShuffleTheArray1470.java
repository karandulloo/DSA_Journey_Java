package LeetCodeSolutions.Arrays.Easy;

import java.util.Arrays;

public class ShuffleTheArray1470 {

//  Input: nums = [2,5,1,3,4,7], n = 3
//  Output: [2,3,5,4,1,7]
//  Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

  public static void main(String[] args) {
    int[] array = {2, 5, 1, 3, 4, 7};
    System.out.println(shuffleArray(array));
  }

  static int[] shuffleArray(int[] array) {
    Arrays.fill(array, 0);

    int x = 0;
    int y = 1;
    for (int i = 0; i < array.length; i++) {
      array[x] = array[i];
      x+=2;
    }
    return array;
  }

}
