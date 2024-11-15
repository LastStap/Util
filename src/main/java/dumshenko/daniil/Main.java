package dumshenko.daniil;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(ShapeType.CIRCLE, 10);

        circle.displayInfo();
        System.out.println("My area: " + circle.calculateArea());
        System.out.println("My perimeter: " + circle.calculatePerimeter());

        Shape rectangle = new Rectangle(ShapeType.RECTANGLE, 5, 6);

        rectangle.displayInfo();
        System.out.println("My area: " + rectangle.calculateArea());
        System.out.println("My perimeter: " + rectangle.calculatePerimeter());

        Rectangle square = new Square(ShapeType.SQUARE, 6);

        square.displayInfo();
        System.out.println("My area: " + square.calculateArea());
        System.out.println("My perimeter: " + square.calculatePerimeter());

        Shape triangle = new Triangle(ShapeType.TRIANGLE, 6, 3, 4);

        triangle.displayInfo();
        System.out.println("My area: " + triangle.calculateArea());
        System.out.println("My perimeter: " + triangle.calculatePerimeter());

    }
}
