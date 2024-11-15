package dumshenko.daniil;

enum ShapeType {
    CIRCLE,
    RECTANGLE,
    SQUARE
}

public class Shape {
    ShapeType shapeType;
    public double area;

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public double calculateArea() {
        return area;
    }

    public void displayInfo() {
        System.out.println("This is an abstract shape");

    }
}
