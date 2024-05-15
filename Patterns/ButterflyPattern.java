package Patterns;

public class ButterflyPattern {
  // n =8
  // i =1
  //m=2

//  *      *    2 *     6 '' i =2 , j= 2(m+i) + 2
//  **    **    4 *     4 '' i =4 , j= 2(i) + 0
//  ***  ***    6 *     2 '' i =6 , j= 2(i) + -2
//  ********    8 *     0 '' i =8 , j= 2(i) + -4

//  ********    8 *     0 '' 2 * 0
//  ***  ***    6 *     2 '' 2 * 1
//  **    **    4 *     4 '' 2 * 2
//  *      *    2 *     6 '' 2 * 3

  public static void main(String[] args) {
//    int m = 4;
    for (int i = 1; i <= 4; i++) {
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      for (int j = 1; j <= 2 * (4 - i); j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }

      System.out.println();
    }

    for (int i = 1; i <= 4; i++) {
      for (int j = 4; j >= i; j--) {
        System.out.print("*");
      }
      for(int k=1;k<=2*(i-1);k++){
        System.out.print(" ");
      }
      for (int j = 4; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println("");
    }

  }
}
