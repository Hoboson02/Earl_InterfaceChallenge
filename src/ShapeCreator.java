import processing.core.PApplet;

public class ShapeCreator extends PApplet {

    //you'll need a structure to hold many shapes
    Shape shape;

    public void settings() {
        size(1000,1000);
    }

    public void setup() {
        //you'll need to create all the shapes that make up your picture
        shape = new Circle(new Point(200.0, 200.0), 50.0);
        shape = new Circle(new Point(300.0, 300.0), 100.0);
        shape = new Circle(new Point(400.0, 400.0), 150.0);
        shape = new Rectangle(new Point(50.0, 50.0), 10.0, 40.0);
        shape = new Rectangle(new Point(0.0, 0.0), 20.0, 20.0);
        shape = new Rectangle(new Point(100.0, 50.0), 30.0, 50.0);
    }

    public void draw() {
        //you'll need to draw all your shapes
        //this is your ShapeCreator object which is your sketch.
        //pass shape.draw the sketch so it can draw on it
        shape.draw();
    }

}
