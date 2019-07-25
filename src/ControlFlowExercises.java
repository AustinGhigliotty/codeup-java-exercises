public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 2;
        do {
            System.out.println(i);
            i *= i;
        }while(i < 65537 && i > 0);
    }
}
