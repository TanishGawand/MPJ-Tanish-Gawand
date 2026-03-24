package Shape;
import java.util.Scanner;
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
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        Shapes square = new Shapes(side);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        Shapes rectangle = new Shapes(length, breadth);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Shapes circle = new Shapes(1); // Placeholder, not used
        System.out.println("Area of Circle: " + circle.calculateArea(radius));
        sc.close();
    }
}
