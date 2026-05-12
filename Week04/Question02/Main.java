package Week04.Question02;
// E-commerce discount system - applies membership and seasonal discounts to products
// initializes only ID and name
// initializes ID, name and price
// initializes all attributes
// accepts only Premium, Regular, Non-Member - else defaults to Non-Member
// calculates price after membership discount
// applies extra seasonal discount without changing stored values
// prints all product details with final price
class Product {
    int productID;
    String productName;
    double basePrice;
    String membershipType;

    // Constructor 1
    Product(int productID, String productName) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = 0;
        this.membershipType = "Non-Member";
    }

    // Constructor 2
    Product(int productID, String productName, double basePrice) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrice;
        this.membershipType = "Non-Member";
    }

    // Constructor 3
    Product(int productID, String productName, double basePrice, String membershipType) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrice;
        setMembershipType(membershipType);
    }

    // Getter
    public double getBasePrice() {
        return basePrice;
    }

    public String getMembershipType() {
        return membershipType;
    }

    // Setter
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setMembershipType(String membershipType) {
        if (membershipType.equals("Premium") ||
                membershipType.equals("Regular") ||
                membershipType.equals("Non-Member")) {

            this.membershipType = membershipType;
        } else {
            this.membershipType = "Non-Member";
        }
    }

    // Calculate final price with membership discount
    double calculateFinalPrice() {
        double discount = 0;

        if (membershipType.equals("Premium")) {
            discount = 0.20;
        } else if (membershipType.equals("Regular")) {
            discount = 0.10;
        }

        return basePrice - (basePrice * discount);
    }

    // Overloaded method with seasonal discount
    double calculateFinalPrice(double seasonalDiscount) {
        double finalPrice = calculateFinalPrice();
        return finalPrice - seasonalDiscount;
    }

    // Display details
    void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Final Price: " + calculateFinalPrice());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop");

        Product p2 = new Product(102, "Phone", 150000);

        Product p3 = new Product(103, "Headset", 10000, "Premium");

        p1.displayProductDetails();

        p2.displayProductDetails();

        p3.displayProductDetails();

        System.out.println("Price after seasonal discount: "
                + p3.calculateFinalPrice(500));
    }
}