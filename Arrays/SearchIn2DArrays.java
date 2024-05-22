package Arrays;

import java.util.Scanner;

public class SearchIn2DArrays {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int rows = scanner.nextInt();
    System.out.println("Enter the number of columns:");
    int columns = scanner.nextInt();

    int[][] newMatrix = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        newMatrix[i][j] = scanner.nextInt();
      }
    }
    System.out.println("Enter the number which you want to search in the matrix and i will porint out the indices of that number:");
    int findNumber = scanner.nextInt();

    printIndices(newMatrix, findNumber);


  }

  static void printIndices(int[][] newMatrix, int findNumber) {
    boolean found = false;
    for (int i = 0; i < newMatrix.length; i++) {
      for (int j = 0; j < newMatrix.length; j++) {
        if (newMatrix[i][j] == findNumber) {
          System.out.print("(" + i + "," + j + ")");
          found = true;
        }
      }
    }
    if (!found) {
      System.out.println("Entered number is not present in the matrix");
    }


  }


}
