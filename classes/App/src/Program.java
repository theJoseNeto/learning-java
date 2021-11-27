import java.util.Scanner;
import entities.Triangle;
import java.lang.Math;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.print("type measures of triangle 'X':  ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.print("type measures of triangle 'Y':  ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double perimeterX = (x.a + x.b + x.c) / 2;
        double perimeterY = (y.a + y.b + y.c) / 2;

        double TriangleAreaX = Math.sqrt(perimeterX * (perimeterX - x.a) * (perimeterX - x.b) * (perimeterX - x.c));
        double TriangleAreaY = Math.sqrt(perimeterY * (perimeterY - y.a) * (perimeterY - y.b) * (perimeterY - y.c));

        if (TriangleAreaX == TriangleAreaY) {
            System.out.printf("Triangle 'X' and 'Y' is equal!");
        } else if (TriangleAreaX > TriangleAreaY) {
            System.out.printf("Triangle 'X' is higher");
        } else {
            System.out.printf("Triangle 'Y' is higher");
        }

        sc.close();

    }
}
