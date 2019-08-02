import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Iris");
        people[1] = new Person("Cadence");
        people[2] = new Person("Winchester");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
    }
//    public static String[] addPerson (Person[] array, String name) {
//        Arrays.copyOf();
//    }
}
