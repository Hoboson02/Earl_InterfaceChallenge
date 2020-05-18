import processing.core.PApplet;
public class Circle extends Shape {

    PApplet p;
    int x =200;
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void draw() {
        p.circle(x, 100, 100);
    }
}