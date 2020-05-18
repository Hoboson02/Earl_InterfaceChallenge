import processing.core.PApplet;
public class Rectangle extends Shape  {

    PApplet p;
    int x = 100;
    private double length, height;

//    public Rectangle(PApplet p) {
//        x = 100;
//        this.p =p;
//    }

    Rectangle(Point upperLeft, double length, double height) {
        super(upperLeft);
        this.length = length;
        this.height = height;
    }


    public double computeArea() { return  length*height; }
    public double getPerimeter() {return 2*length + 2*height;}

    @Override
    public void draw() {
        p.rect(x, 100, 100, 100);
    }

}
