package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    String getString() {
        System.out.println("Say something: ");
        return scanner.nextLine();
    }
    boolean yesNo() {
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            return true;
        } else return false;
    }
    int getInt(int min, int max){
        do {
            System.out.println("Enter a number between " + min + " and " + max + ": ");
            try {
                int answer = Integer.valueOf(scanner.nextLine());
                if (answer >= min && answer <= max) {
                    return answer;
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a number.");
            }
        } while (true);
    }
    int getInt(){
        do {
            System.out.println("Enter a number: ");
            try {
                return Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter an actual number");
            }
        } while (true);
    }
    public double getDouble(double min, double max){
//        return scanner.nextDouble();
        do {
            System.out.println("Enter a double between " + min + " and " + max + ": ");
            try {
                double answer = Double.valueOf(scanner.nextLine());
                if (answer >= min && answer <= max) {
                    return answer;
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a number.");
            }
        } while (true);
    }
    public double getDouble(){
//        return scanner.nextDouble();
        do {
            System.out.println("Enter a double: ");
            try {
                return Double.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("That's not a number.");
            }
        } while (true);
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Yes or no?");
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1,10));
        System.out.println(input.getInt());
        System.out.println(input.getDouble(0.1,9.9));
        System.out.println(input.getDouble());
        System.out.println(input.getString());
    }
//    Integer.valueOf(String s);
//    Double.valueOf(String s);
}
