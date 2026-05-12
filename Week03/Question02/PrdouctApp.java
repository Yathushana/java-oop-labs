package Week03.Question02;
// Manages retail store products - validates price and quantity inputs
import java.util.Scanner;

class Product{
    private int productId;
    private String  productName;
    private double price;
    private int quantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >0){
            this.price = price;
        }
        else {
            System.out.println("Price must be greater than 0");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity can't be negative");
        }
    }
    public void  displayDetails(){
        System.out.println("Product ID : "+productId);

        System.out.println("Product Name: "+productName);

        System.out.println("Price : "+price);

        System.out.println("Quantity: "+quantity);
    }
    public double  calculateTotalValue(){

        return price * quantity;

    }
}
public class PrdouctApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Product p1 =new Product();

        System.out.println("Enter Product Id: ");
        p1.setProductId(sc.nextInt());

        sc.nextLine();

        System.out.println("Enter Product Name: ");
        p1.setProductName(sc.nextLine());


        System.out.print("Enter Price: ");
        p1.setPrice(sc.nextDouble());

        System.out.print("Enter Quantity: ");
        p1.setQuantity(sc.nextInt());

        p1.displayDetails();

        System.out.println("Total Stock Value: "+p1.calculateTotalValue());

    }

}
