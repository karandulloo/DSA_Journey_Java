package MethodAndFunctions;

import java.util.Scanner;

public class FIndPrime {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number here :");
    int number = scanner.nextInt();

    findPrimeNumber(number);

  }

  public static void findPrimeNumber(int number) {
    if (number <= 1) {
      System.out.println("The given number is not a prime number");
      return;
    }
    for (int i = 2; i * i < number; i++) { // i took the square root of the number and till then the loop will work
      if (number % i == 0) {
        System.out.println("not a prime number");
        return;
      }
    }
    System.out.println("Prime number");
  }
}
