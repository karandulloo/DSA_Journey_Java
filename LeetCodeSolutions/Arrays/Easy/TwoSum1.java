package LeetCodeSolutions.Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] answer = twoSum(nums, target);
        for (int result : answer) {
            System.out.println(result);

        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> outputMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (outputMap.containsKey(complement)) {
                return new int[]{outputMap.get(complement), i};
            }
            outputMap.put(nums[i], i);
        }
        return new int[]{};
    }

}
