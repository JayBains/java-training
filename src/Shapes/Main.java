package Shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle testRect = new Rectangle(5.4, 3);
        System.out.println("perimeter = " + testRect.perimeter());
        System.out.println("area = " + testRect.area());

        Circle testCirc = new Circle(6);
        System.out.println("perimeter = " + testCirc.perimeter());
        System.out.println("area = " + testCirc.area());

        Triangle testTri = new Triangle(8, 5, 7, 7);
        System.out.println("perimeter = " + testTri.perimeter());
        System.out.println("area = " + testTri.area());
    }
}