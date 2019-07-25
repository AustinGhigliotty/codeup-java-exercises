import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
//        System.out.printf("number | squared | cubed");
        System.out.println();
        System.out.println("Here's your table!");
        System.out.println();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d      | %-8d| %d", i, i*i, i*i*i);
//            scan.nextLine();
            System.out.println();
        }
        System.out.print("Do you want to continue? (y/n)");
        String continueAsk = scan.next();
        if (continueAsk.equals("y")) {
            main(null);
        }
    }
}