import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
        String myString = "Hello";
        System.out.println(myString);
        float myNumber = 3.14f;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
        int x1 = 4 + 5;
        int x2 = 3;
        int y2 = 4 * x2;
        int x3 = 10;
        int y3 = 2;
        x3 /= y3;
        y3 -= x3;
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scan.nextLine();
        System.out.println(userInput);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        System.out.println(number);
        System.out.print("Enter 3 words: ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.print("Now enter a sentence: ");
        String sentence = scan.nextLine();
        System.out.println("You typed: " + sentence);
        System.out.print("Enter width (in feet): ");
        int width = scan.nextInt();
        System.out.print("Enter length (in feet): ");
        int length = scan.nextInt();
        System.out.print("Enter height (in feet): ");
        int height = scan.nextInt();
        int perimeter = (width * 2) + (length * 2);
        int area = width * length;
        int volume = width * length * height;
        System.out.printf("The perimeter is %d ft", perimeter);
        System.out.println();
        System.out.printf("The area is %d ft^2", area);
        System.out.println();
        System.out.printf("The volume is %d ft^3", volume);
        System.out.println();
    }
}
