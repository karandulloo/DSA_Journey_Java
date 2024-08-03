package MethodAndFunctions;

public class RadiusOfCylinder {

  public static void main(String[] args) {
    Cylinder cylinder = new Cylinder(1.5f, 2.5f);

    System.out.println("Surface area of Cylinder is:" + cylinder.volumeOfCylinder());
    System.out.println("Volume of Cylinder is:" + cylinder.surfaceAreaOfCylinder());
  }

  static class Cylinder {

    private float radius;
    private float height;

    public Cylinder(float r, float h) {
      this.radius = r;
      this.height = h;

    }

    public float getRadius() {
      return radius;
    }

    public void setRadius(float r) {
      this.radius = r;
    }

    public float getHeight() {
      return height;
    }

    public void setHeight(float h) {
      this.height = h;
    }

    float volumeOfCylinder() {
      return (float) ((22.0 / 7.0) * radius * radius * height);
    }

    float surfaceAreaOfCylinder() {
      return (float) (2 * (22.0 / 7.0) * radius * height + 2 * (22.0 / 7.0) * radius * radius);
    }

  }
}
