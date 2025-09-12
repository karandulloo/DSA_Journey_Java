package recursion;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] nums = {1, 2, 6, 4, 5};
		System.out.println(Arrays.toString(reverseArray(nums)));

	}

	private static int[] reverseArray(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return nums;
		}

		return reverseArray(nums);

	}
}
