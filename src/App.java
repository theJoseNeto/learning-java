
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higth = higherNumber(a, b, c);

        System.out.print("The higher number is: " + higth);

        sc.close();

    }

    public static int higherNumber(int x, int y, int z) {
        int highNumber;

        if (x > y && x > z) {
            highNumber = x;
        } else if (y > x && y > z) {
            highNumber = y;
        } else {
            highNumber = z;
        }
        return highNumber;

    }

}
