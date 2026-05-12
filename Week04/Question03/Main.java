package Week04.Question03;
// Ride-sharing driver performance system - tracks earnings and calculates score-based bonuses
// initializes only ID and name
// initializes only base salary
// initializes all attributes
// validates 1-5 range - defaults to 1 if invalid
// calculates bonus using stored performance score
// calculates bonus using custom score without modifying stored value
// returns base salary plus calculated bonus
class Driver {
    private int driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    // Constructor 1
    Driver(int driverID, String driverName) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = 0;
        this.performanceScore = 1;
    }

    // Constructor 2
    Driver(double baseSalary) {
        this.driverID = 0;
        this.driverName = "Unknown";
        this.baseSalary = baseSalary;
        this.performanceScore = 1;
    }

    // Constructor 3
    Driver(int driverID, String driverName,
           double baseSalary, int performanceScore) {

        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        setPerformanceScore(performanceScore);
    }

    // Getters
    public int getDriverID() {
        return driverID;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    // Setters
    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public void setPerformanceScore(int performanceScore) {
        if (performanceScore >= 1 && performanceScore <= 5) {
            this.performanceScore = performanceScore;
        } else {
            this.performanceScore = 1;
        }
    }

    // Calculate bonus using stored performance score
    double calculateBonus() {
        double bonusPercentage = 0;

        switch (performanceScore) {
            case 5:
                bonusPercentage = 0.25;
                break;
            case 4:
                bonusPercentage = 0.20;
                break;
            case 3:
                bonusPercentage = 0.15;
                break;
            case 2:
                bonusPercentage = 0.10;
                break;
            default:
                bonusPercentage = 0.05;
        }

        return baseSalary * bonusPercentage;
    }

    // Overloaded method with custom score
    double calculateBonus(int customScore) {
        double bonusPercentage = 0;

        switch (customScore) {
            case 5:
                bonusPercentage = 0.25;
                break;
            case 4:
                bonusPercentage = 0.20;
                break;
            case 3:
                bonusPercentage = 0.15;
                break;
            case 2:
                bonusPercentage = 0.10;
                break;
            default:
                bonusPercentage = 0.05;
        }

        return baseSalary * bonusPercentage;
    }

    // Calculate total salary
    double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }

    // Display details
    void displayDetails() {
        System.out.println("Driver ID: " + driverID);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Driver d1 = new Driver(101, "Kamal");

        Driver d2 = new Driver(50000);

        Driver d3 = new Driver(103, "Ravi", 80000, 5);

        d1.displayDetails();

        d2.displayDetails();

        d3.displayDetails();

        System.out.println("Custom Bonus: " +
                d3.calculateBonus(4));
    }
}
