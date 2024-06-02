package LeetCodeSolutions.Arrays.Easy;

public class ConcatenationOfArray1929 {

  //Input: nums = [1,2,1]
  //Output: [1,2,1,1,2,1]
  public static void main(String[] args) {
    int[] nums = {1, 2, 1};
    newArray(nums);
    for (int num : nums) {
      System.out.println(num);

    }
  }

  static int[] newArray(int[] nums) {
    int[] ans = new int[2 * nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      ans[i + nums.length] = nums[i];
    }
    return ans;
  }
}
