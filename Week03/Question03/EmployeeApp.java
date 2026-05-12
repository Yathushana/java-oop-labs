package Week03.Question03;
import java.util.Scanner;
// Calculates employee bonus based on performance rating - displays total salary
class Employee {

    // Private attributes
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private int performanceRating;

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter for employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter for employeeName
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter for basicSalary
    public double getBasicSalary() {
        return basicSalary;
    }

    // Setter for basicSalary
    public void setBasicSalary(double basicSalary) {

        if(basicSalary > 0) {
            this.basicSalary = basicSalary;
        }
        else {
            System.out.println("Invalid Salary");
        }
    }

    // Getter for performanceRating
    public int getPerformanceRating() {
        return performanceRating;
    }

    // Setter for performanceRating
    public void setPerformanceRating(int performanceRating) {

        if(performanceRating >= 1 &&
                performanceRating <= 5) {

            this.performanceRating = performanceRating;
        }
        else {
            System.out.println("Rating must be between 1 and 5");
        }
    }

    // Calculate bonus
    public double calculateBonus() {

        double bonus = 0;

        if(performanceRating == 5) {
            bonus = basicSalary * 0.20;
        }
        else if(performanceRating == 4) {
            bonus = basicSalary * 0.15;
        }
        else if(performanceRating == 3) {
            bonus = basicSalary * 0.10;
        }
        else if(performanceRating == 2) {
            bonus = basicSalary * 0.05;
        }
        else {
            bonus = 0;
        }

        return bonus;
    }

    // Calculate total salary
    public double calculateTotalSalary() {

        return basicSalary + calculateBonus();
    }

    // Display details
    public void displayDetails() {

        System.out.println("\nEmployee Details:");

        System.out.println("Employee ID: " + employeeId);

        System.out.println("Name: " + employeeName);

        System.out.println("Basic Salary: " + basicSalary);

        System.out.println("Performance Rating: "
                + performanceRating);

        System.out.println("Bonus: "
                + calculateBonus());

        System.out.println("Total Salary: "
                + calculateTotalSalary());
    }
}

public class EmployeeApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee e1 = new Employee();

        System.out.print("Enter Employee ID: ");
        e1.setEmployeeId(input.nextInt());

        input.nextLine();

        System.out.print("Enter Employee Name: ");
        e1.setEmployeeName(input.nextLine());

        System.out.print("Enter Basic Salary: ");
        e1.setBasicSalary(input.nextDouble());

        System.out.print("Enter Performance Rating (1-5): ");
        e1.setPerformanceRating(input.nextInt());

        e1.displayDetails();
    }
}
