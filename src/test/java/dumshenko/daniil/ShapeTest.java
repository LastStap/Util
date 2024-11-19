package dumshenko.daniil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void shouldCorrectlyComputeCircleArea() {
        // Given
        Circle circle = new Circle(10);
        double expectedArea = Math.PI * 10 * 10;

        // When
        double actualArea = circle.calculateArea();

        // Then
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeRectangleArea() {
        // Given
        Rectangle rectangle = new Rectangle(5, 6);
        double expectedArea = 5 * 6;

        // When
        double actualArea = rectangle.calculateArea();

        // Then
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeTriangleArea() {
        // Given
        Shape triangle = new Triangle(6, 4, 4);
        double expectedArea = Math.sqrt(7 * (7 - 4) * (7 - 4));

        // When
        double actualArea = triangle.calculateArea();

        // Then
        assertEquals(expectedArea, actualArea, 0.0001);
    }


    @Test
    public void shouldCorrectlyComputeSquareArea() {
        // Given
        Shape square = new Square(5);
        double expectedArea = 5 * 5;

        // When
        double actualArea = square.calculateArea();

        // Then
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeSquarePerimeter() {
        //Given
        Shape square = new Square(5);
        double expectedPerimeter = (5 * 2) + (5 * 2);

        //When
        double actualPerimeter = square.calculatePerimeter();

        //Then
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeRectanglePerimeter() {
        //Given
        Shape rectangle = new Rectangle(5, 6);
        double expectedPerimeter = (5 * 2) + (6 * 2);

        //When
        double actualPerimeter = rectangle.calculatePerimeter();

        //Then
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeCirclePerimeter() {
        //Given
        Shape circle = new Circle(10);
        double expectedPerimeter = 2 * Math.PI * 10;

        //When
        double actualPerimeter = circle.calculatePerimeter();

        //Then
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001);
    }

    @Test
    public void shouldCorrectlyComputeTrianglePerimeter() {
        //Given
        Shape triangle = new Triangle(6, 3, 4);
        double expectedPerimeter = 6 + 3 + 4;

        //When

        double actualPerimeter = triangle.calculatePerimeter();
        //Then
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001);
    }
}
