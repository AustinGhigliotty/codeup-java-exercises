package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student h = new Student("h");
        Student kevin = new Student("Kevin");
        Student miguel = new Student("Miguel");
        Student spencer = new Student("Spencer");

        h.addGrade(80);
        h.addGrade(70);
        h.addGrade(90);
        h.addGrade(86);
        kevin.addGrade(96);
        kevin.addGrade(85);
        kevin.addGrade(90);
        kevin.addGrade(89);
        miguel.addGrade(88);
        miguel.addGrade(84);
        miguel.addGrade(91);
        miguel.addGrade(86);
        spencer.addGrade(83);
        spencer.addGrade(81);
        spencer.addGrade(93);
        spencer.addGrade(90);

        HashMap<String, Student> students = new HashMap<>();
        students.put("h", h);
        students.put("keven", kevin);
        students.put("MTG", miguel);
        students.put("Deku", spencer);

//        HashMap<Student, Integer> stuIds = new HashMap<>();
//        stuIds.put(h, 0);
//        stuIds.put(kevin, 1);
//        stuIds.put(miguel, 2);
//        stuIds.put(spencer, 3);

//        System.out.println("h = " + h.getGradeAverage());
//        System.out.println("kevin = " + kevin.getGradeAverage());
//        System.out.println("miguel = " + miguel.getGradeAverage());
//        System.out.println("spencer = " + spencer.getGradeAverage());
        boolean yes = true;
        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students: ");
        for (String username: students.keySet()) {
            System.out.printf("|%s|  ", username);
            System.out.println();
        }
        do {
            System.out.println("What student would you like to see more information on?\n");
            String answer = scan.next();
            if (students.containsKey(answer)) {
                System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %.1f", students.get(answer).getName(), answer, students.get(answer).getGradeAverage());
//                Name: Zach - GitHub Username: zgulde
//                Current Average: 87.4
                System.out.println();
            }
            System.out.println("Would you like to see another student?");
            String answer2 = scan.next();
            if (answer2.equalsIgnoreCase("y") || answer2.equalsIgnoreCase("yes") || answer2.equalsIgnoreCase("yea") || answer2.equalsIgnoreCase("yeah") || answer2.equalsIgnoreCase("ye")) {
                continue;
            } else {
                yes = false;
            }
        } while (yes);
        System.out.println("Goodbye, and have a wonderful day!");
//        System.out.println(students);
//        System.out.println(students.get(spencer));
//        System.out.println(h.getGradeAverage());

    }
}
