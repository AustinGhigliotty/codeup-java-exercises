import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        if (number <= 100 && number > 87) {
            System.out.println("That grade is an A");
        } else if (number <= 87 && number > 79) {
            System.out.println("That grade is a B");
        } else if (number <= 79 && number > 66) {
            System.out.println("That grade is a C");
        } else if (number <= 66 && number > 59) {
            System.out.println("That grade is a D");
        } else if (number <= 59 && number > 0) {
            System.out.println("That grade is an F");
        }
        System.out.print("Do you want to continue? (y/n)");
        String continueAsk = scan.next();
        if (continueAsk.equals("y")) {
            main(null);
        }

//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
    }
}