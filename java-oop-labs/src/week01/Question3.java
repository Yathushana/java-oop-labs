package week01;
import java.util.Scanner;

// Question 3: Class to check Even or Odd

class EvenOddNumber {
        public boolean findEvenOrOdd(int i) {
            return i % 2 == 0;
        }
}
public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EvenOddNumber obj = new EvenOddNumber();

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (obj.findEvenOrOdd(num)) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}





