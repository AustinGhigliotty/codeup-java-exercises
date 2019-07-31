package util;

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
            int answer = scanner.nextInt();
            if (answer >= min && answer <= max) {
                return answer;
            }
        } while (true);
    }
    int getInt(){
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }
    public double getDouble(double min, double max){
        return scanner.nextDouble();
    }
    public double getDouble(){
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Yes or no?");
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1,10));
        System.out.println(input.getInt());
        System.out.println(input.getString());
    }
}
