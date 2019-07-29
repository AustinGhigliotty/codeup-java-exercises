import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("For add - Type a number: ");
        int first = scan.nextInt();
        System.out.println("Type another number: ");
        int second = scan.nextInt();
        add(first, second);

        System.out.println("For subtract - Type a number: ");
        first = scan.nextInt();
        System.out.println("Type another number: ");
        second = scan.nextInt();
        subtract(first, second);

        System.out.println("For multiply - Type a number: ");
        first = scan.nextInt();
        System.out.println("Type another number: ");
        second = scan.nextInt();
        multiply(first, second);

        System.out.println("For divide - Type a number: ");
        first = scan.nextInt();
        System.out.println("Type another number (don't do 0): ");
        second = scan.nextInt();
        divide(first, second);

        System.out.println("For modulus - Type a number: ");
        first = scan.nextInt();
        System.out.println("Type another number: ");
        second = scan.nextInt();
        modulus(first, second);
    }

    private static int add(int a, int b) {
        System.out.printf("The result is %d", a+b);
        System.out.println();
        return a + b;
    }
    private static int subtract(int a, int b) {
        System.out.printf("The result is %d", a-b);
        System.out.println();
        return a - b;
    }
    private static int multiply(int a, int b) {
        int sum = 0;
        for (int i = b; i > 0; i--) {
            sum += a;
        }
        System.out.printf("The result is %d", sum);
        System.out.println();
        return a * b;
    }
    private static int divide(int a, int b) {
        System.out.printf("The result is %d", a/b);
        System.out.println();
        return a / b;
    }
    private static int modulus(int a, int b) {
        System.out.printf("The result is %d", a%b);
        System.out.println();
        return a % b;
    }
}