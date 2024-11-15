package dumshenko.daniil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(FigureType.CIRCLE, 10);
        double expectedArea = 3.14159 * 10 * 10;
        assertEquals(expectedArea, circle.calculateArea(), 0.0001);
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(FigureType.RECTANGLE, 5, 6);
        double expectedArea = 5 * 6;
        assertEquals(expectedArea, rectangle.calculateArea(), 0.0001);
    }

    @Test
    public void testSquareArea() {
        Square square = new Square(FigureType.SQUARE, 6, 6);
        double expectedArea = 6 * 6;
        assertEquals(expectedArea, square.calculateArea(), 0.0001);
    }
}