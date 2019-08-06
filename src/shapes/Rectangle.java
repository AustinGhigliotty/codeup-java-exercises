package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void setWidth() {

    }

    @Override
    public void setLength() {

    }

    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2 * this.length);
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}
