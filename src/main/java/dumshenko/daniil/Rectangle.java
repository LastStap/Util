package dumshenko.daniil;

public class Rectangle extends Shape {

    private double rectangleWidth;
    private double rectangleHeight;

    public Rectangle(FigureType typeOfFigure, double rectangleWidth, double rectangleHeight) {
        super(typeOfFigure);
        this.rectangleWidth = rectangleWidth;
        this.rectangleHeight = rectangleHeight;
    }

    @Override
    public void displayInfo() {
        System.out.println("I`m Rectangle ");
        System.out.println("My width: " + rectangleWidth);
        System.out.println("My height: " + rectangleHeight);
    }

    @Override
    public double calculateArea() {
        figureArea = (rectangleWidth * rectangleHeight);
        return figureArea;
    }

}
