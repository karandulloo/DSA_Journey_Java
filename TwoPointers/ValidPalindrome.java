package TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        Boolean ans = isPalindrome(s);
        System.out.println(ans);

    }

    static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        Character firstChar= s.charAt(start);
        Character lastChar= s.charAt(end);

        while (start <= end) {
            if (!Character.isLetterOrDigit(firstChar)) {
                start++;
            } else if (!Character.isLetterOrDigit(lastChar)) {
                end--;
            } else {

                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(start))) {
                    return false;
                }
                start++;
                end--;
            }
        }

        return true;
    }
}
