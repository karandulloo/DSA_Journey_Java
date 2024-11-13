package HashingTutorial;

import java.util.*;

public class HashSetTutorial {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 5};

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
//        for (int i : arr2) {
//            set.add(i);
//        }

        System.out.println(set.size());


    }

}
