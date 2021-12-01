
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Enter product name:");
        product.name = sc.nextLine();

        System.out.print("Enter product price:");
        product.price = sc.nextDouble();

        System.out.print("Enter product quantity:");
        product.quantity = sc.nextInt();
    

        sc.close();

    }
}
