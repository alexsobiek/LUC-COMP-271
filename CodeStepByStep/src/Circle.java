/*
Write a class of objects named Circle that remembers information about a circle. You must include the following public
members. It may help you to know that there is a constant named Math.PI storing the value of π, roughly 3.14159.
*/

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}
