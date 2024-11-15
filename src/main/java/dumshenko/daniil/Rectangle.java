package dumshenko.daniil;

public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(ShapeType shapeType, double width, double height) {
        super(shapeType);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo() {
        System.out.println("I'm Rectangle ");
        System.out.println("My width: " + width);
        System.out.println("My height: " + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return (width * 2) + (height * 2);
    }
}
