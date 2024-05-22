package Arrays;


import java.util.Arrays;
import java.util.Scanner;

//take input a matrix   and search for a given number of x and prints indices
public class Matrix2D {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter no of rows in the matrix:");
    int rows = scanner.nextInt();
    System.out.print("Enter no of columns in the matrix:");
    int columns = scanner.nextInt();

    int[][] arrayMatrix = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        arrayMatrix[i][j] = scanner.nextInt();
      }
    }

    //PRINT THE MATRIX using for each loop
    for (int[] num : arrayMatrix) {
      System.out.println(Arrays.toString(num));
    }

  }

}
