package entities;

public class Employee {
    public String name;
    public double grosSalary;
    public double tax;

    public double netSalary() {
        return grosSalary -= tax;
    }

    public void increaseSalary(double percent) {
        grosSalary += (grosSalary * percent) / 100;
    }
}
