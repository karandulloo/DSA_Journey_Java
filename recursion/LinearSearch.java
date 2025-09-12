package recursion;

public class LinearSearch {

	public static void main(String[] args) {
		int[] nums = {1, 2, 6, 4, 5};
		int target = 6;
		boolean result = findNum(nums, nums.length - 1, target);
		System.out.println(result);

	}

	private static boolean findNum(int[] nums, int length, int target) {
		if (length == 0) {
			return false;
		}

		if (nums[length] == target) {
			return true;

		}
		return findNum(nums, length - 1, target);

	}
}
