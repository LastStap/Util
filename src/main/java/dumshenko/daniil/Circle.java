package dumshenko.daniil;

public class Circle extends Shape {

    private double radius;

    public Circle(FigureType typeOfFigure, double radius) {
        super(typeOfFigure);
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("I'm Circle ");
        System.out.println("My radius: " + radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2.0); //Формула для обчислення площі круга
    }
}
