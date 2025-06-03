class Shape1 {
    double getArea();
    double getPerimeter();
}

class Circle extends Shape1 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape1 {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double getArea() {
        return length * width;
    }
    double getPerimeter() {
        return 2 * (length + width);
    }
}
class Triangle extends Shape1 {
    private double side1, side2, side3;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    double getPerimeter() {
        return side1 + side2 + side3;
    }
}
public class area {
    public static void main(String[] args) {
        Shape1 circle = new Circle(5);
        Shape1 rectangle = new Rectangle(4, 6);
        Shape1 triangle = new Triangle(3, 4, 5);

        System.out.println("Circle -> Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle -> Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());
        System.out.println("Triangle -> Area: " + triangle.getArea() + ", Perimeter: " + triangle.getPerimeter());
    }
}