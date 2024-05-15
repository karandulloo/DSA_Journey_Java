package Patterns;

public class StandardPattern {

  public static void main(String args[]) {

    int i = 0;
    int j = 0;
    int n = 4;

    for (i = 1; i <= 4; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
