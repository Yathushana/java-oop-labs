package week01;
/*
 * Q1: Convert marathon distance (miles + yards) to kilometers
 * Formula: 1 mile = 1.609 km, 1760 yards = 1 mile
 */
public class Question1 {
    public static void main(String[] args) {
        int miles = 26;
        int yards = 385;

        double kilometers = (miles * 1.609) + (yards / 1760.0 * 1.609);
        System.out.println("Kilometer: "+kilometers);
    }
}
