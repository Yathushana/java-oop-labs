package Week06.Question02;
class Membership {
    String membershipID;
    String memberName;
    int durationMonths;

    Membership() {
        membershipID = "M001";
        memberName = "John";
        durationMonths = 3;
    }

    Membership(String membershipID,
               String memberName,
               int durationMonths) {

        this.membershipID = membershipID;
        this.memberName = memberName;
        this.durationMonths = durationMonths;
    }

    void displayMembershipDetails() {
        System.out.println(memberName);
    }

    double calculateFee() {
        return 5000;
    }

    double calculateFee(double discountPercentage) {
        return calculateFee() -
                (calculateFee() * discountPercentage / 100);
    }
}

class BasicMembership extends Membership {
    boolean hasGymAccess;

    BasicMembership() {
        super();
        hasGymAccess = true;
    }

    BasicMembership(String membershipID,
                    String memberName,
                    int durationMonths,
                    boolean hasGymAccess) {

        super(membershipID, memberName, durationMonths);
        this.hasGymAccess = hasGymAccess;
    }

    @Override
    double calculateFee() {
        return 200 * durationMonths;
    }

    @Override
    void displayMembershipDetails() {
        System.out.println("Basic Membership");
        System.out.println("Fee: " + calculateFee());
        System.out.println("Gym Access: " + hasGymAccess);
    }
}

class PremiumMembership extends Membership {
    boolean includePersonalTraining;

    PremiumMembership() {
        super();
    }

    PremiumMembership(String membershipID,
                      String memberName,
                      int durationMonths,
                      boolean includePersonalTraining) {

        super(membershipID, memberName, durationMonths);
        this.includePersonalTraining = includePersonalTraining;
    }

    @Override
    double calculateFee() {
        double fee = 300 * durationMonths;

        if (includePersonalTraining) {
            fee += 100;
        }

        return fee;
    }

    @Override
    void displayMembershipDetails() {
        System.out.println("Premium Membership");
        System.out.println("Fee: " + calculateFee());
        System.out.println("Training: " + includePersonalTraining);
    }
}

public class Main{
    public static void main(String[] args) {

        BasicMembership b = new BasicMembership();

        PremiumMembership p =
                new PremiumMembership("P001",
                        "Kamal", 5, true);

        b.displayMembershipDetails();
        p.displayMembershipDetails();

        System.out.println(b.calculateFee(10));
        System.out.println(p.calculateFee(15));
    }
}

