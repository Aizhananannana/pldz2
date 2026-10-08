import java.util.Scanner;

public class Taskw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int bestCost = Integer.MAX_VALUE;
        int best1 = 0;
        int best10 = 0;
        int best60 = 0;

        for (int t60 = 0; t60 <= n / 60 + 1; t60++) {
            for (int t10 = 0; t10 <= 6; t10++) {

                int rides = t60 * 60 + t10 * 10;

                int remaining = n - rides;
                int t1 = 0;

                if (remaining > 0) {
                    t1 = remaining;
                }

                int cost = t60 * 440 + t10 * 125 + t1 * 15;

                if (rides + t1 >= n && cost < bestCost) {
                    bestCost = cost;
                    best1 = t1;
                    best10 = t10;
                    best60 = t60;
                }
            }
        }

        System.out.println(best1 + " " + best10 + " " + best60);
    }
}