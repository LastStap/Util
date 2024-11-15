package dumshenko.daniil;

public class Square extends Rectangle {

    public Square(ShapeType shapeType, double size) {
        super(shapeType, size, size);
    }

    @Override
    public void displayInfo() {
        System.out.println("I'm Square ");
        System.out.println("My size: " + width);
    }
}