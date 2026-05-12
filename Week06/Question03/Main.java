package Week06.Question03;
class Shape {
    String shapeName;

    Shape() {
        shapeName = "Shape";
    }

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    void displayShapeDetails() {
        System.out.println(shapeName);
    }

    double calculateArea() {
        return 0.0;
    }

    double calculateArea(double factor) {
        return calculateArea() * factor;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle() {
        super("Rectangle");
        length = 5;
        width = 4;
    }

    Rectangle(String shapeName,
              double length,
              double width) {

        super(shapeName);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    void displayShapeDetails() {
        System.out.println("Rectangle Area: " + calculateArea());
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle() {
        super("Triangle");
    }

    Triangle(String shapeName,
             double base,
             double height) {

        super(shapeName);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    void displayShapeDetails() {
        System.out.println("Triangle Area: " + calculateArea());
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        Triangle t =
                new Triangle("Triangle", 10, 5);

        r.displayShapeDetails();
        t.displayShapeDetails();

        System.out.println(r.calculateArea(2));
        System.out.println(t.calculateArea(3));
    }
}