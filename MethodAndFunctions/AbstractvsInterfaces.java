package MethodAndFunctions;

//abstract class HornClass {
//
//  final int a = 45;
//
//  abstract void blowHornDhoom1();
//
//  abstract void blowHornDhoom2();
//}
//
//abstract class SpeedClass {
//
//  final int a = 100;
//
//  abstract void applyBrake();
//
//  abstract void applyAccelarator();
//}
//
//class Subclass extends HornClass ,SpeedClass { // so here class cannot extend multiple abstract classes
//
//  @Override
//  void blowHornDhoom1() {
//    System.out.println("Dhoom machale");
//  }
//
//  void blowHornDhoom2() {
//    System.out.println("Dhoom 2 machale");
//
//  }
//
//  @Override
//  void applyBrake() {
//    System.out.println("Decreasing");
//  }
//
//  @Override
//  void applyAccelarator() {
//    System.out.println("Increasing");
//  }
//}

// SO above example multiple abstract classes cannot be extended but interfaces can be


interface HornClass {

  final int a = 45;

  void blowHornDhoom1();

  void blowHornDhoom2();
}

interface SpeedClass {

  final int a = 100;

  void applyBrake();

  void applyAccelarator();
}

class Subclass implements HornClass, SpeedClass {

  @Override
  public void blowHornDhoom1() {
    System.out.println("Dhoom machale");
  }

  @Override
  public void blowHornDhoom2() {
    System.out.println("Dhoom machale");

  }

  @Override
  public void applyBrake() {
    System.out.println("Dhoom machale");

  }

  @Override
  public void applyAccelarator() {
    System.out.println("Dhoom machale");

  }
}

public class AbstractvsInterfaces {

  public static void main(String[] args) {

  }

}
