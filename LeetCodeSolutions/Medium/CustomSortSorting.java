package LeetCodeSolutions.Medium;

import java.util.HashMap;

class CustomSortSorting {
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        customSortString(order, s);
    }

    public static StringBuilder customSortString(String order, String s) {
        HashMap<String, Integer> map = new HashMap<>();

        //hashmap is created
        for (int i = 0; i < order.length(); i++) {
            map.put(order.substring(i, i + 1), i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.substring(i, i + 1))) {
                sb.append(map.get(s.substring(i, i + 1)));
            }
        }

        return sb;


    }
}
