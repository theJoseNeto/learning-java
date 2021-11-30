import java.util.Scanner;
import entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("type measures of triangle 'X':  ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("type measures of triangle 'Y':  ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double triangleAreaX = x.area();
        double triangleAreaY = y.area();

        if (triangleAreaX == triangleAreaY) {
            System.out.printf("Triangle 'X' and 'Y' is equal!");
        } else if (triangleAreaX > triangleAreaY) {
            System.out.printf("Triangle 'X' is higher");
        } else {
            System.out.printf("Triangle 'Y' is higher");
        }

        sc.close();

    }

}
