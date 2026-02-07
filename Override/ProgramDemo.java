package Override;
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class ProgramDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println("Addition (int): " + c.add(5, 3));
        System.out.println("Addition (double): " + c.add(5.5, 2.3));

        Animal a = new Dog();   // Runtime polymorphism
        a.sound();
    }
}
