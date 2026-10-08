import java.util.Scanner;

public class Taskg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        if ((k + 4) % 4 == 0 && (k + 4) / 4 >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
