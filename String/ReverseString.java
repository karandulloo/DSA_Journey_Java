package String;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                // Swap characters only if they are different
                char temp = str.charAt(start);
                str.setCharAt(start, str.charAt(end));
                str.setCharAt(end, temp);
            }
            // Move towards the center regardless of whether we swapped or not
            start++;
            end--;
        }

        System.out.println(str);

//    for (int i = 0; i < str.length() / 2; i++) {
//        int back = str.length() - 1 - i;
//
//      char frontChar = str.charAt(i);
//      char backChar = str.charAt(back);
//      str.setCharAt(i, frontChar);
//      str.setCharAt(back, backChar);
//
//    }
//        System.out.println(str);
    }
}
