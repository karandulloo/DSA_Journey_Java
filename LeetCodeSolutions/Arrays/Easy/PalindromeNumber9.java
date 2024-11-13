package LeetCodeSolutions.Arrays.Easy;

public class PalindromeNumber9 {
    public static void main(String[] args) {
        int number = -121;
        Boolean answer = isPalindrome(number);
        System.out.println(answer);
    }

    public static boolean isPalindrome(int x) {
        String numStr = String.valueOf(x);
        int left = 0;
        int right = numStr.length() - 1;
        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
