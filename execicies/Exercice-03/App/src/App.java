import entities.Employee;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Type funcionary name: ");
        emp.name = sc.nextLine();

        System.out.println("type gross salary: ");
        emp.grosSalary = sc.nextDouble();

        System.out.println("type tax: ");
        emp.tax = sc.nextDouble();
        
        emp.netSalary();
        System.out.printf("Employee: %s, R$%.2f", emp.name, emp.grosSalary);
       
        System.out.println();
       
        System.out.println("Which percentage to increase salary?: ");
        double percent = sc.nextDouble();
       
        emp.increaseSalary(percent);
        System.out.println(emp.grosSalary);

        sc.close();
    }
}
