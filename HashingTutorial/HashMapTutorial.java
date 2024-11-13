package HashingTutorial;

import java.util.*;

public class HashMapTutorial {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        majorityElement(nums);
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() > nums.length / 2) {
                return set.getKey();
            }
        }
        return 0;
    }
}
