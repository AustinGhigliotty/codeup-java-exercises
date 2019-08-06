package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    //    // returns the student's name
//    public String getName();
//    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
//        Student h = new Student("h");
//        h.addGrade(80);
//        h.addGrade(70);
//        h.addGrade(90);
//        h.addGrade(86);
//        System.out.println(h.getGradeAverage());
//        System.out.println(h.grades.toString());
    }
}
