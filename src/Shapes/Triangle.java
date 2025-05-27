package Shapes;

public class Triangle extends Shape{
    double base;
    double height;
    double sideA;
    double sideB;

    public Triangle(double base, double height, double sideA, double sideB){
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return base + sideA + sideB;
    }

    @Override
    public double area() {
        return 0.5*base*height;
    }
}
