package Shapes;

public class Rectangle extends Shape {
    private final double length;
    private final double height;

    public Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return length*2 + height*2;
    }

    @Override
    public double area() {
        return length*height;
    }
}
