import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int [] A = {3,2,1,1,2,3,1};
//        int result = solution(A);
//        System.out.println(result);

        StaticExample obj = new StaticExample();
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        System.out.println(StaticExample.getCount());

    }

//    static int solution(int[] A) {
//        // Implement your solution here
//        // as we know the range is 1 to 4 hence maximumn number is 4 always
//        int maxNumber = A[0];
//        int minNumber = A[0];
//        int midNumber = 0;
//        int result = 0;
//        // int counter = 0;
//
//        for (int i = 0; i < A.length; i++) {
//            minNumber = Math.min(minNumber, A[i]);
//            maxNumber = Math.max(maxNumber, A[i]);
//        }
//
//        midNumber = maxNumber - minNumber;
//        if(midNumber==0){
//            return 0;
//        }
//        System.out.print("this is mid" + midNumber);
//
//        for (int i = 0; i < A.length; i++) {
//            if (midNumber > A[i]) {
//                int counter = midNumber;
//                while (counter > A[i]) {
//                    result = result + 1;
//                    counter++;
//                }
//            } else if (midNumber < A[i]) {
//                int counter = midNumber;
//                while (counter < A[i]) {
//                    result = result + 1;
//                    counter++;
//                }
//            }
//        }
//        return result;
//
//    }
}
