package dumshenko.daniil;

enum FigureType {
    CIRCLE,
    RECTANGLE,
    SQUARE
}

public class Shape {
    FigureType figureType;
    public double area;

    public Shape(FigureType typeOfFigure) {
        this.typeOfFigure = typeOfFigure;
    }

    public double calculateArea() {
        return figureArea;
    }

    public void displayInfo() {
        System.out.println("This is abstract figure");

    }
}

