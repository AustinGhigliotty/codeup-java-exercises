import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalGuesses = 0;
        boolean guessing = true;
        double randomNum = Math.ceil(Math.random() * 100);
        System.out.println("Try to guess the number!");
        boolean wantToPlay = true;
        do {
            do {
                int guess = scan.nextInt();
                totalGuesses++;
                if (guess == randomNum) {
                    System.out.printf("GOOD GUESS! You got it in %d guesses!", totalGuesses);
                    System.out.println();
                    System.out.println("Play again? (y/n)");
                    String ask = scan.next();
                    if (ask.equalsIgnoreCase("y")) {
                        main(null);
                    } else {
                        guessing = false;
                        wantToPlay = false;
                        break;
                    }
                } else if (guess < randomNum) {
                    System.out.println("HIGHER");
                } else {
                    System.out.println("LOWER");
                }
            } while (guessing && totalGuesses < 10);
        if (wantToPlay) {
            System.out.println("You took too many guesses ;~;");
            System.out.println("Play again? (y/n)");
            String ask = scan.next();
            if (ask.equalsIgnoreCase("y")) {
                main(null);
            } else {
                guessing = false;
                wantToPlay = false;
            }
        }
        } while (wantToPlay);
        System.out.println("gg");
    }
}
