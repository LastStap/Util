package dumshenko.daniil;

public class Square extends Rectangle {


    public Square(FigureType typeOfFigure, double size) {
        super(typeOfFigure, size, size);
    }

    @Override
    public void displayInfo() {
        System.out.println("I'm Square ");
        System.out.println("My width: " + squareWidth);
        System.out.println("My height: " + squareHeight);
    }

}
