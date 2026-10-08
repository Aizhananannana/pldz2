import java.util.Scanner;

public class Taskz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n % 100 >= 11 && n % 100 <= 14) {
            System.out.println(n + " bochek");
        } else if (n % 10 == 1) {
            System.out.println(n + " bochka");
        } else if (n % 10 >= 2 && n % 10 <= 4) {
            System.out.println(n + " bochki");
        } else {
            System.out.println(n + " bochek");
        }
    }
}