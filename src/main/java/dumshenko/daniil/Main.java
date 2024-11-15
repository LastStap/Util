package dumshenko.daniil;

public class Main {

    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 2, 5, 2};
//
//        int numToRemove = 2;
//
//        int[] result = removeOccurrences(array, numToRemove);
//
//        for (int num : result) {
//            System.out.print(num + " ");
//        }

        Shape circle = new Circle(FigureType.CIRCLE, 10);

        circle.displayInfo();
        System.out.println("My area: " + circle.calculateArea());

        Shape rectangle = new Rectangle(FigureType.RECTANGLE, 5, 6);

        rectangle.displayInfo();
        System.out.print("My area: ");
        System.out.println(rectangle.calculateArea());

        Rectangle square = new Square(FigureType.SQUARE, 6, 6);

        square.displayInfo();
        System.out.print("My area: ");
        System.out.println(square.calculateArea());

    }
}