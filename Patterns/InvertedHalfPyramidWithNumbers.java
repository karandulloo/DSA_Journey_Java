package Patterns;

public class InvertedHalfPyramidWithNumbers {

  public static void main(String[] args) {
    int n = 1;

    for (int i = 0; i <= 4; i++) {
      for (int j = 4; j >= i; j--) {
        System.out.print(n);
        n++;
      }
      n=1;
      System.out.println();

    }
  }

}
