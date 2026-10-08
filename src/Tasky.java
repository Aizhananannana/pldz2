import java.util.Scanner;

public class Tasky {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        if (y > 1) {
            System.out.println(x + " " + (y - 1));
        }

        if (x > 1) {
            System.out.println((x - 1) + " " + y);
        }

        if (y < N) {
            System.out.println(x + " " + (y + 1));
        }

        if (x < M) {
            System.out.println((x + 1) + " " + y);
        }
    }
}
