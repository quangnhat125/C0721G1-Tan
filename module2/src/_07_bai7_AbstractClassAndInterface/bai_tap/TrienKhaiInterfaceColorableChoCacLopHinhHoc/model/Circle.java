package _07_bai7_AbstractClassAndInterface.bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHoc.model;


 public class Circle extends Shape {
    private double radius = 2.0;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double perimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }



}