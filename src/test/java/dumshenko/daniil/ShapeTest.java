package dumshenko.daniil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void shouldCorrectlyComputeCircleArea() {
        // Given
        Circle circle = new Circle(ShapeType.CIRCLE, 10);

        // When
        double expectedArea = Math.PI * 10 * 10;

        // Then
        assertEquals(expectedArea, circle.calculateArea(), 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeRectangleArea() {
        // Given
        Rectangle rectangle = new Rectangle(ShapeType.RECTANGLE, 5, 6);

        // When
        double expectedArea = 5 * 6;

        // Then
        assertEquals(expectedArea, rectangle.calculateArea(), 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeTriangleArea() {
        // Given
        Shape triangle = new Triangle(ShapeType.TRIANGLE, 6, 4, 4);

        // When
        double expectedArea = Math.sqrt(7 * (7 - 6) * (7 - 4) * (7 - 4));

        // Then
        assertEquals(expectedArea, triangle.calculateArea(), 0.0001);
    }


    @Test
    public void shouldCorrectlyComputeSquareArea() {
        // Given
        Shape square = new Square(ShapeType.SQUARE, 5);

        // When
        double expectedArea = 5 * 5;

        // Then
        assertEquals(expectedArea, square.calculateArea(), 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeSquarePerimeter() {
        //Given
        Shape square = new Square(ShapeType.SQUARE, 5);

        //When
        double expectedPerimeter = (5 * 2) + (5 * 2);

        //Then
        assertEquals(expectedPerimeter, square.calculatePerimeter(), 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeRectanglePerimeter() {
        //Given
        Shape rectangle = new Rectangle(ShapeType.RECTANGLE, 5, 6);

        //When
        double expectedPerimeter = (5 * 2) + (6 * 2);

        //Then
        assertEquals(expectedPerimeter, rectangle.calculatePerimeter(), 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeCirclePerimeter() {
        //Given
        Shape circle = new Circle(ShapeType.CIRCLE, 10);

        //When
        double expectedPerimeter = 2 * Math.PI * 10;

        //Then
        assertEquals(expectedPerimeter, circle.calculatePerimeter(), 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeTrianglePerimeter() {
        //Given
        Shape triangle = new Triangle(ShapeType.TRIANGLE, 6, 3, 4);

        //When
        double expectedPerimeter = 6 + 3 + 4;

        //Then
        assertEquals(expectedPerimeter, triangle.calculatePerimeter(), 0.0001);
    }
}
