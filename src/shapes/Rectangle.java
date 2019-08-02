package shapes;

public class Rectangle {
    protected double length;
    protected double width;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getPerimeter() {
        System.out.println();
        System.out.print("Rectangle's perimeter: ");
        return (2 * width) + (2 * length);
    }
    public double getArea() {
        System.out.println();
        System.out.print("Rectangle's area: ");
        return (width * length);
    }
}
