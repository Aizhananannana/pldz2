import java.util.Scanner;

public class Taskad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int correct = in.nextInt();
        int student = in.nextInt();

        if (correct == 1) {
            if (student == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (student != 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}