abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle = " + (3.14 * 5 * 5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle = " + (10 * 5));
    }
}

public class Abstraction Main{
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();

        c.area();
        r.area();
    }
}
