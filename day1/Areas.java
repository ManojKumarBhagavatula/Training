package day1;

class Triangle {
    public void calculateArea(float base, float height) {
        float area = 0.5f * base * height;
        System.out.println("The area of the triangle is: " + area + " sq units");
    }
}

class Circle {
    public void calculateArea(float radius) {
        float area = 3.14f * radius * radius;
        System.out.println("The area of the circle is: " + area + " sq units");
    }
}

class Rectangle {
    public void calculateArea(float length, float width) {
        float area = length * width;
        System.out.println("The area of the rectangle is: " + area + " sq units");
    }
}

class Square {
    public void calculateArea(float side) {
        float area = side * side;
        System.out.println("The area of the square is: " + area + " sq units");
    }
}

class Rhombus {
    public void calculateArea(float diagonal1, float diagonal2) {
        float area = 0.5f * diagonal1 * diagonal2;
        System.out.println("The area of the rhombus is: " + area + " sq units");
    }
}

public class Areas {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.calculateArea(10, 20);

        Circle circle = new Circle();
        circle.calculateArea(5);

        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(10, 20);

        Square square = new Square();
        square.calculateArea(5);

        Rhombus rhombus = new Rhombus();
        rhombus.calculateArea(10, 20);
    }
}
