package Arrays;

import java.util.Scanner;

public class InputArrays {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = scanner.nextInt();

    String[] arrayNames = new String[size];

    for (int i = 0; i < size; i++) {
      System.out.println("Enter all the names you want to store in the array");
      arrayNames[i] = scanner.next();
    }

    for (int i = 0; i < arrayNames.length; i++) {
      System.out.println("name " + (i+1) +" is : " + arrayNames[i]);
    }


  }
}
