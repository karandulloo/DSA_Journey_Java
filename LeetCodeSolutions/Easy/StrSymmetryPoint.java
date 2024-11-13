package LeetCodeSolutions.Easy;

import java.util.*;

//Write a function:
//
//class Solution { public int solution(String S); }
//that, given a string S, returns the index (counting from 0) of a character such that the part of the string to the left of that character is a reversal of the part of the string to its right. The function should return −1 if no such index exists.
//
//Note: reversing an empty string (i.e. a string whose length is zero) gives an empty string.
//
//        For example, given a string:
//
//        "racecar"
//
//the function should return 3, because the substring to the left of the character "e" at index 3 is "rac", and the one to the right is "car".
//
//Given a string:
//
//        "x"
//
//the function should return 0, because both substrings are empty.
//
//Write an efficient algorithm for the following assumptions:
//
//the length of string S is within the range [0..2,000,000].

public class StrSymmetryPoint {
    public static void main(String[] args) {
        String S = "racecar";
        solution(S);
    }
    public static void solution(String S) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            if (!map.containsKey(S.substring(i, i + 1))) {
                map.put(S.substring(i, i + 1), 1);
            } else {
                map.put(S.substring(i, i + 1), map.get(S.substring(i, i + 1)) + 1);
            }
        }

        for (Map.Entry<String, Integer> set : map.entrySet()) {
            if (set.getValue() == 1) {
                for (int i = 0; i < S.length(); i++) {
                    if (Objects.equals(set.getKey(), S.substring(i, i + 1))) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
