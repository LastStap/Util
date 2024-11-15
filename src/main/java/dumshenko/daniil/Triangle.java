package dumshenko.daniil;

class Triangle extends Shape {
    private double sideA, sideB, sideC;

    public Triangle(ShapeType shapeType, double sideA, double sideB, double sideC) {
        super(shapeType);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void displayInfo() {
        System.out.println("I'm Triangle ");
    }

    @Override
    double calculateArea() {
        double p = calculatePerimeter() / 2; // напівпериметр
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // формула Герона
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
