package recursion;

import java.util.Arrays;

public class FindArrayIsSorted {

	public static void main(String[] args) {
		int[] nums = {1, 2, 6, 4, 5};
		boolean result = findSort(nums, nums.length - 1);
		System.out.println(result);

	}

	private static boolean findSort(int[] nums, int length) {
		if (nums.length == 0 || nums.length == 1) {
			return true;
		}

		if (length == 0) {
			return true;
		}

		if (nums[length] < nums[length - 1]) {
			return false;

		}
		return findSort(nums, length - 1);

	}
}
