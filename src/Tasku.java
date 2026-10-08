import java.util.Scanner;

public class Tasku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Находим самую большую сторону
        int max = Math.max(a, Math.max(b, c));

        int x;
        int y;

        if (max == a) {
            x = b;
            y = c;
        } else if (max == b) {
            x = a;
            y = c;
        } else {
            x = a;
            y = b;
        }

        // Проверяем существование треугольника
        if (x + y <= max) {
            System.out.println("impossible");
        } else if (x * x + y * y == max * max) {
            System.out.println("right");
        } else if (x * x + y * y > max * max) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }
    }
}