package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Scanner scan = new Scanner(System.in);
        Circle circle = new Circle(10);
        System.out.printf("The area of the circle is %.1f", circle.getArea());
        System.out.println();
        System.out.printf("The circumference of the circle is %.1f", circle.getCircumference());
        System.out.println();
    }
}
