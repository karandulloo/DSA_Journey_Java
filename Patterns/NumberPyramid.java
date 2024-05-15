package Patterns;

public class NumberPyramid {

  public static void main(String[] args) {
//     1
//    2 2
//   3 3 3
// 4  4  4  4
//5  5  5  5  5
    int n = 5;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = i; k <= i; k++) {
        for (int j = 1; j <= k; j++) {
          System.out.print(k);
          for (int l = i; l <= i; l++) {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }

}
