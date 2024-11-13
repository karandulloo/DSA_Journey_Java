package LeetCodeSolutions.Arrays.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstUnique {
    public static void main(String[] args) {
        int[] array = {4, 10, 5, 4, 2, 10};
        findFirstUnique(array);
    }

    public static void findFirstUnique(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }

        }

        for (int result : array) {
            if (map.get(result) == 1) {
                System.out.println(result);
                break;
            }
        }
    }
}