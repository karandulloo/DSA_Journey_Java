package MethodAndFunctions;

class Papa {

  public void papaMethodA() {
    System.out.println("I am Super class method A");
  }

  public void papaMethodB() {
    System.out.println("I am Super class method B");
  }
}

class Beta extends Papa {

  @Override
  public void papaMethodA() {
    System.out.println("I will call override method of class papa");
  }

  @Override
  public void papaMethodB() {
    super.papaMethodB();// it is overriding so this sub class method will be called but
    // due to super first Parent class method will be called and then this method.
    System.out.println("I am Sub class method B");
  }
}

public class Dynamic_methid_dispatch {

  public static void main(String[] args) {
    Papa relationship = new Beta();
    relationship.papaMethodA();
    relationship.papaMethodB();

  }

}
