package dumshenko.daniil;

public class Square extends Rectangle {

    public Square(double size) {
        super(ShapeType.SQUARE, size, size);
    }

    @Override
    public void displayInfo() {
        System.out.println("I'm Square ");
        System.out.println("My size: " + width);
    }
}