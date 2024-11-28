package StackAndQueues;

import java.util.*;


public class MinimumAddtoMakeParenthesesValid921 {
    public static void main(String[] args) {
        String s = "()))((";
        MinimumAddtoMakeParenthesesValid921 class1 = new MinimumAddtoMakeParenthesesValid921();
        int result = class1.minAddToMakeValid(s);
        System.out.println(result);


    }

    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (s.charAt(i) == ')') {
                    if (stack.pop() == '(') {
                        break;
                    }

                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.size();
    }
}
