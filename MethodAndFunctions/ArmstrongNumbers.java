package MethodAndFunctions;

import java.util.Scanner;

public class ArmstrongNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(findArmstrongNumber(number));
  }

  static boolean findArmstrongNumber(int number) {
//    int rem = 0;
    int sum = 0;
    int original = number;
    while (number > 0) {
      int rem = number % 10;
      number = number / 10;
      sum = sum + rem * rem * rem;
      System.out.println(sum);

    }
    return original == sum;

  }

}
