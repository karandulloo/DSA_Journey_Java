package Patterns;

public class SolidRhombus {

  // n=5
//       *****   5-1 ''  5*  5-5 ''
//      *****    5-2 ''  5*  5-4 ''
//     *****     5-3 ''  5*  5-3 ''
//    *****      5-4 ''  5*  5-2 ''
//   *****       5-5 ''  5*  5-1 ''

  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 5; k++) {
        System.out.print("*");
      }
      for (int j = 5; j >= n - j; j--) {
        System.out.print(" ");
      }
      System.out.println("");
    }

  }
}
