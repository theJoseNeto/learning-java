import java.util.Scanner;
import util.calculator;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator();
        System.out.print("insert radius value: ");
        double radius = sc.nextDouble();

        double c = calc.circuference(radius);
        double volum = calc.volume(radius);

        System.out.printf("circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", volum);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();

    }

}
