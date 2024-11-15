package dumshenko.daniil;

enum ShapeType {
    CIRCLE,
    RECTANGLE,
    SQUARE,
    TRIANGLE
}

abstract class Shape {
    ShapeType shapeType;
    public double area;

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    void displayInfo() {
        System.out.println("Площа: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
}
