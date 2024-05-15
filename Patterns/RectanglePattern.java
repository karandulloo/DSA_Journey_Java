package Patterns;

public class RectanglePattern {

  public static void main(String[] args) {
    int i;
    int j;

    try {
      for(i=1;i<=4;i++){
        for (j=1;j<=4;j++){
        System.out.print("*");
      }
        System.out.println(" ");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }
}
