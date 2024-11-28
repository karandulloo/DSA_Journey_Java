package LinkedList;

import java.util.*;

public class LongestPalindrome409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        int result = longestPalindrome(s);
        System.out.println(result);
    }

    static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int length = 0;
        boolean hasoddcount = false;
        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasoddcount = true;
            }
        }
        if (hasoddcount) {
            return length + 1;
        } else {
            return length;
        }
    }

}
