package dumshenko.daniil;

public class Square extends Rectangle {


    public Square(FigureType typeOfFigure, double squareWidth, double squareHeight) {
        super(typeOfFigure, squareWidth, squareHeight);
        this.squareWidth = squareWidth;
        this.squareHeight = squareHeight;
    }

    @Override
    public void displayInfo() {
        System.out.println("I'm Square ");
        System.out.println("My width: " + squareWidth);
        System.out.println("My height: " + squareHeight);
    }

}
