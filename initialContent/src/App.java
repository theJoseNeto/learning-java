import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Triangulos X e Y;
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle x: ");
        xA = sc.nextDouble();
        if (xA <= 0) {
            xA = 1;
        }
        xB = sc.nextDouble();
        if (xB <= 0) {
            xB = 1;
        }
        xC = sc.nextDouble();
        if (xC <= 0) {
            xC = 1;
        }
        System.out.println("Enter the measures of triangle y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

        double pY = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
        System.out.printf("Triangle x area is %.2f%n", areaX);
        System.out.printf("Triangle y area is %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Triangle x is higher");
        } else if (areaX == areaY) {
            System.out.println("Triangle x and y is equal!");
        } else {
            System.out.println("Triangle Y is higher");
        }

        sc.close();

    }

}
