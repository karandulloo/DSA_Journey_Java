package LeetCodeSolutions.Arrays.Easy;

public class BuildArrayFromPermutation1920 {

  public static void main(String[] args) {
    int[] nums = {0, 2, 1, 5, 3, 4};
    //ans[i] = nums[nums[i]]
    //expected ans[i] = [0,1,2,4,5,3]
    findTheAnswer(nums);
    for (int num : nums) {
      System.out.println(num);
    }
  }

  static int[] findTheAnswer(int[] nums) {
    // Encode both values into the array
    for (int i = 0; i < nums.length; i++) {
      // nums[nums[i]] % n gets the original value at nums[nums[i]]
      // (nums[nums[i]] % n) * n shifts it to the higher bits
      nums[i] += (nums[nums[i]] % nums.length) * nums.length;
    }

    // Decode the new values from the array
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] / nums.length;
    }
    return nums;
  }
}
