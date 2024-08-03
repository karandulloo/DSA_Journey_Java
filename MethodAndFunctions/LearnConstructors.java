package MethodAndFunctions;

public class LearnConstructors {

  public static void main(String[] args) {
    Student karan = new Student("karan", 29, 99.99f);
    Student anchal = new Student("anchal", 34, 99.98f);
    karan.printInfo();
    anchal.printInfo();
  }

}

class Student {

  String name;
  int age;
  float marks;

  Student(String name, int age, float marks) {
    this.name = name;
    this.age = age;
    this.marks = marks;
  }

  void printInfo() {
    System.out.println(this.age);
  }
}
