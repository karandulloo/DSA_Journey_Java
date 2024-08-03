package MethodAndFunctions;

public class Recursion {

  public static void main(String[] args) {
//    System.out.println(factorial(5));
    //if you want to call a non static method through a static main method you need to create a instance of the class
//    and then you can access the method defined inside that class.
    Recursion recursion = new Recursion();
    System.out.println(recursion.factorial(5));
    System.out.println(recursion.fibonacci(7));

  }


  int factorial(int x) {
    if (x == 0 || x == 1) {
      return 1;
    }
    return x * factorial(x - 1);
  }

  int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);

//    0,1,1,2,3,5,8,13
  }


}
