import java.util.Scanner;

public class Taskj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); // рубли товара
        int b = in.nextInt(); // копейки товара
        int c = in.nextInt(); // рубли оплаты
        int d = in.nextInt(); // копейки оплаты

        int price = a * 100 + b;
        int money = c * 100 + d;

        int change = money - price;

        int e = change / 100;
        int f = change % 100;

        System.out.println(e + " " + f);
    }
}