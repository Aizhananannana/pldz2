import java.util.Scanner;

public class Taski {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        // a = 0 и b = 0 → числитель всегда равен 0
        if (a == 0 && b == 0) {
            // Проверяем, когда знаменатель равен 0:
            // cx + d = 0
            // Так как c и d одновременно не равны 0,
            // знаменатель равен 0 только для одного x.
            System.out.println("INF");
        }
        // a = 0, b != 0 → числитель никогда не равен 0
        else if (a == 0) {
            System.out.println("NO");
        }
        // a != 0 → x = -b / a
        else if (-b % a != 0) {
            System.out.println("NO");
        }
        else {
            int x = -b / a;

            // Проверяем знаменатель
            if (c * x + d == 0) {
                System.out.println("NO");
            } else {
                System.out.println(x);
            }
        }
    }
}