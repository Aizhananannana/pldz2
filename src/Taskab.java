import java.util.Scanner;

public class Taskab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        int[] numbers = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String result = "";

        for (int i = 0; i < numbers.length; i++) {
            while (x >= numbers[i]) {
                result += roman[i];
                x -= numbers[i];
            }
        }

        System.out.println(result);
    }
}