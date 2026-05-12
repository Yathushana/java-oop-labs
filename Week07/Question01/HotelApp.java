package Week07.Question01;
class Room {
    protected int roomNumber;
    protected String guestName;
    protected int numberOfNights;

    // Default constructor
    Room() {
        roomNumber = 000;
        guestName = " Unknown";
        numberOfNights = 0;
    }

    // Parameterized constructor
    Room(int roomNumber, String guestName, int numberOfNights) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
    }

    // Display details
    void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Number of Nights: " + numberOfNights);
    }

    // Overloaded method
    double calculateRoomCost() {
        return 150.0 * numberOfNights;
    }

    double calculateRoomCost(int discountPerNight) {
        double base = calculateRoomCost();
        return base - (discountPerNight * numberOfNights);
    }
}

// Subclass StandardRoom
class StandardRoom extends Room {
    boolean wifiIncluded;

    StandardRoom() {
        super();
        wifiIncluded = true;
    }

    @Override
    double calculateRoomCost() {
        return 100.0 * numberOfNights;
    }

    @Override
    void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("WiFi Included: " + wifiIncluded);
        System.out.println("Total Cost: $" + calculateRoomCost());
    }
}

// Subclass LuxurySuite
class LuxurySuite extends Room {
    boolean extraServices;

    LuxurySuite(int roomNumber, String guestName,
                int numberOfNights, boolean extraServices) {

        super(roomNumber, guestName, numberOfNights);
        this.extraServices = extraServices;
    }

    @Override
    double calculateRoomCost() {
        double total = 200.0 * numberOfNights;

        if (extraServices) {
            total += 75;
        }

        return total;
    }

    @Override
    void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("Extra Services Included: " + extraServices);
        System.out.println("Total Cost: $" + calculateRoomCost());
    }
}

// Main class
public class HotelApp {
    public static void main(String[] args) {

        // Default constructor object
        StandardRoom s1 = new StandardRoom();

        // Parameterized constructor object
        LuxurySuite l1 =
                new LuxurySuite(305, "Alice Green", 3, true);

        System.out.println("=== Standard Room ===");
        s1.displayRoomDetails();
        System.out.println("Cost with Discount: $" +
                s1.calculateRoomCost(10));

        System.out.println("\n=== Luxury Suite ===");
        l1.displayRoomDetails();
        System.out.println("Cost with Discount: $" +
                l1.calculateRoomCost(20));
    }
}