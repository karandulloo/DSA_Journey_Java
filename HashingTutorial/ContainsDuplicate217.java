package HashingTutorial;

import java.util.*;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = {2, 14, 18, 22, 22};
        boolean answer =  containsDuplicate(nums);
        System.out.println(answer);

    }

    static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() > 1) {
                return true;
            }
        }
        return false;
    }
}
