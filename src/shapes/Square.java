package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter() {
        System.out.println();
        System.out.print("Square's perimeter: ");
            return (4 * this.width);
        }
        public double getArea() {
            System.out.println();
            System.out.print("Square's area: ");
            return (this.width * this.width);
        }
}
