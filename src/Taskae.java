import java.util.Scanner;

public class Taskae {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        int middle = a + b + c - min - max;

        System.out.println(min + " " + middle + " " + max);
    }
}