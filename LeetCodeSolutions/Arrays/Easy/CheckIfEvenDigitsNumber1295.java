package LeetCodeSolutions.Arrays.Easy;

public class CheckIfEvenDigitsNumber1295 {

  public static void main(String[] args) {
    int[] arrayOfNumbers = {0, -10, 00, 0000, 200, -3000, 40000, -500000, 6000000, -70000000, 800000000};

    System.out.println(findEvenOrOddNumbers(arrayOfNumbers));

  }

  static int findEvenOrOddNumbers(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      int n = 0;

      if (nums[i] == 0) {
        continue;
      } else {
        while (nums[i] > 0) {
          n++;
          nums[i] = nums[i] / 10;
        }
      }
      if (n % 2 == 0) {
        count++;
      }
    }
    return count;
  }
}
