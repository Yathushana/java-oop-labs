package Week06.Question04;
class Vehicle {
    String vehicleName;

    Vehicle() {
        vehicleName = "Vehicle";
    }

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    void displayVehicleDetails() {
        System.out.println(vehicleName);
    }

    double calculateSpeed() {
        return 0.0;
    }

    double calculateSpeed(double factor) {
        return calculateSpeed() * factor;
    }
}

class Car extends Vehicle {
    int engineCapacity;
    double topSpeed;

    Car() {
        super("Car");
        engineCapacity = 1500;
        topSpeed = 180;
    }

    Car(String vehicleName,
        int engineCapacity,
        double topSpeed) {

        super(vehicleName);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    @Override
    double calculateSpeed() {
        return topSpeed;
    }

    @Override
    void displayVehicleDetails() {
        System.out.println("Car Speed: " + calculateSpeed());
        System.out.println("Engine: " + engineCapacity);
    }
}

class Bicycle extends Vehicle {
    int gearCount;
    double maxPedalSpeed;

    Bicycle() {
        super("Bicycle");
    }

    Bicycle(String vehicleName,
            int gearCount,
            double maxPedalSpeed) {

        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    @Override
    double calculateSpeed() {
        return maxPedalSpeed;
    }

    @Override
    void displayVehicleDetails() {
        System.out.println("Bicycle Speed: " + calculateSpeed());
        System.out.println("Gear Count: " + gearCount);
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();

        Bicycle b =
                new Bicycle("Mountain Bike", 6, 40);

        c.displayVehicleDetails();
        b.displayVehicleDetails();

        System.out.println(c.calculateSpeed(2));
        System.out.println(b.calculateSpeed(3));
    }
}