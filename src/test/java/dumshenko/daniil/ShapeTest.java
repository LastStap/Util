package dumshenko.daniil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void shouldCorrectlyComputeCircleArea() {
        Circle circle = new Circle(ShapeType.CIRCLE, 10);
        double expectedArea = Math.PI * 10 * 10;
        assertEquals(expectedArea, circle.calculateArea(), 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeRectangleArea() {
        Rectangle rectangle = new Rectangle(ShapeType.RECTANGLE, 5, 6);
        double expectedArea = 5 * 6;
        assertEquals(expectedArea, rectangle.calculateArea(), 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeSquareArea() {
        Square square = new Square(ShapeType.SQUARE, 6);
        double expectedArea = 6 * 6;
        assertEquals(expectedArea, square.calculateArea(), 0.0001);
    }
}