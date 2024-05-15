package Patterns;

public class PalindromicPattern {

//        1
//       212    2
//      32123   3
//     4321234  4
//    543212345 5

  public static void main(String[] args) {
//    int n=5;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {  //2
        System.out.print(j);
//        for (int l = i; l >= k; l--) { //
//          System.out.print(l);
//        }

      }
      for(int j=2;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }

  }

}
