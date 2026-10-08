import java.util.Scanner;

public class Taskl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int time;

        if (n <= k) {
            time = 2 * m;
        } else if (n <= 2 * k) {
            time = 3 * m;
        } else {
            int batches = (n + k - 1) / k;
            time = batches * 2 * m;
        }

        System.out.println(time);
    }
}