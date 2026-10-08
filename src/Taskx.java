import java.util.Scanner;

public class Taskx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int bestCost = Integer.MAX_VALUE;
        int bestRides = Integer.MAX_VALUE;

        int best1 = 0;
        int best5 = 0;
        int best10 = 0;
        int best20 = 0;
        int best60 = 0;

        for (int t60 = 0; t60 <= n / 60 + 1; t60++) {
            for (int t20 = 0; t20 <= 3; t20++) {
                for (int t10 = 0; t10 <= 2; t10++) {
                    for (int t5 = 0; t5 <= 4; t5++) {

                        int rides = t60 * 60 + t20 * 20
                                + t10 * 10 + t5 * 5;

                        int t1 = Math.max(0, n - rides);

                        rides += t1;

                        int cost = t60 * 440
                                + t20 * 230
                                + t10 * 125
                                + t5 * 70
                                + t1 * 15;

                        if (cost < bestCost ||
                                (cost == bestCost && rides > bestRides)) {

                            bestCost = cost;
                            bestRides = rides;

                            best1 = t1;
                            best5 = t5;
                            best10 = t10;
                            best20 = t20;
                            best60 = t60;
                        }
                    }
                }
            }
        }

        System.out.println(
                best1 + " " +
                        best5 + " " +
                        best10 + " " +
                        best20 + " " +
                        best60
        );
    }
}