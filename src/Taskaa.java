import java.util.Scanner;

public class Taskaa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean even = a % 2 == 0 || b % 2 == 0 || c % 2 == 0;
        boolean odd = a % 2 != 0 || b % 2 != 0 || c % 2 != 0;

        if (even && odd) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
