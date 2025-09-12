package Prefix;

import java.util.Arrays;

public class productExceptSelf238 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		System.out.println(Arrays.toString(productExceptSelf(nums))); // [24, 12, 8, 6]
	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];

		// 1) ans[i] = product of all elements to the left (prefix)
		ans[0] = 1;
		for (int i = 1; i < n; i++) {
			ans[i] = ans[i - 1] * nums[i - 1];
		}

		// 2) Multiply by product of all elements to the right (suffix), tracked in O(1) space
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			ans[i] *= suffix;
			suffix *= nums[i];
		}

		return ans;
	}
}
