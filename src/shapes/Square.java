package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth() {

    }

    @Override
    public void setLength() {

    }

    @Override
    public double getPerimeter() {
        return 4 * this.width;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}
