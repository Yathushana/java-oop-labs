package week02;
// Lab Sheet 02 - Question 1: Accept employee type, basic salary and overtime hours, calculate and display total salary
import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Type(1,2 or 3): ");
        int empType = sc.nextInt();

        System.out.println("Enter Basic Salary: ");
        int baSalary = sc.nextInt();

        System.out.println("Enter Overtime Hours: ");
        int otHours = sc.nextInt();

        double otRate = 0;

        if (empType == 1){
            otRate = 1000;
        } else if (empType == 2) {
            otRate = 1500;
        } else if (empType == 3) {
            otRate =1700;
        }
        double totalSalary = baSalary + (otHours * otRate);
        System.out.println("Total Salary: "+totalSalary);
    }
}
