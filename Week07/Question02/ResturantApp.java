package Week07.Question02;
//Meal class create pannum (orderID, customerName, quantity + constructors default & parameterized + displayOrderDetails + calculateBill overloading 12×qty and coupon discount); RegularMeal extends Meal (isVegetarian attribute + override calculateBill 10×qty + override displayOrderDetails Veg/Non-Veg + total bill show); ComboMeal extends Meal (includesDrinkAndDessert boolean + override calculateBill 15×qty + extra $5 if true + override displayOrderDetails extra items + final bill show); ResturantApp main class create RegularMeal (default constructor) + ComboMeal (parameterized values set) + calculateBill methods call + displayOrderDetails call
class Meal {
    String orderID;
    String customerName;
    int quantity;

    // Default constructor
    Meal() {
        orderID = "";
        customerName = "";
        quantity = 0;
    }

    // Parameterized constructor
    Meal(String orderID, String customerName, int quantity) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.quantity = quantity;
    }

    // Display method
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
    }

    // Method overloading - no parameter
    double calculateBill() {
        return 12.00 * quantity;
    }

    // Method overloading - with coupon
    double calculateBill(int couponAmount) {
        double total = calculateBill();
        return total - couponAmount;
    }
}
class RegularMeal extends Meal {
    boolean isVegetarian;

    RegularMeal() {
        super();
    }

    RegularMeal(String orderID, String customerName, int quantity, boolean isVegetarian) {
        super(orderID, customerName, quantity);
        this.isVegetarian = isVegetarian;
    }

    // Override bill
    @Override
    double calculateBill() {
        return 10.00 * quantity;
    }

    // Override display
    @Override
    void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Meal Type: " + (isVegetarian ? "Veg" : "Non-Veg"));
        System.out.println("Total Bill: $" + calculateBill());
    }
}
class ComboMeal extends Meal {
    boolean includesDrinkAndDessert;

    ComboMeal() {
        super();
    }

    ComboMeal(String orderID, String customerName, int quantity, boolean includesDrinkAndDessert) {
        super(orderID, customerName, quantity);
        this.includesDrinkAndDessert = includesDrinkAndDessert;
    }

    // Override bill
    @Override
    double calculateBill() {
        double total = 15.00 * quantity;
        if (includesDrinkAndDessert) {
            total += 5;
        }
        return total;
    }

    // Override display
    @Override
    void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Includes Drink & Dessert: " + includesDrinkAndDessert);
        System.out.println("Total Bill: $" + calculateBill());
    }
}
public class ResturantApp {
    public static void main(String[] args) {

        // i. RegularMeal using default constructor
        RegularMeal r1 = new RegularMeal();
        r1.orderID = "000";
        r1.customerName = "Guest";
        r1.quantity = 0;
        r1.isVegetarian = true;

        // ii. ComboMeal using parameterized constructor
        ComboMeal c1 = new ComboMeal("C001", "Alice", 2, true);

        // iii. calculateBill() calls
        System.out.println("Regular Meal Bill (no coupon): $" + r1.calculateBill());
        System.out.println("Regular Meal Bill (with coupon): $" + r1.calculateBill(29));

        System.out.println("Combo Meal Bill: $" + c1.calculateBill());

        // iv. Display details
        System.out.println("\n--- Regular Meal Details ---");
        r1.displayOrderDetails();

        System.out.println("\n--- Combo Meal Details ---");
        c1.displayOrderDetails();
    }
}