package Shape;
class Shapes {

    // Constructor overloading
    Shapes(double side) {
        System.out.println("Area of Square: " + (side * side));
    }

    Shapes(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Method overloading
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

public class ShapeMain {
    public static void main(String[] args) {

        Shapes square = new Shapes(4);
        Shapes rectangle = new Shapes(5, 6);

        Shapes circle = new Shapes(1);
        System.out.println("Area of Circle: " + circle.calculateArea(3));
    }
}
