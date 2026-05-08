package week02;
// Question 2: Accept 5 integers, find largest value and sum of all elements
import java.util.Scanner;

public class Question2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Enter interger ");
        for(int i=0; i<5; i++){
            num[i] = sc.nextInt();
        }
        int largest = num[0];
        int sum = 0;

         for(int i =0; i<5; i++) {
         sum += num[i];
         if(num[i]>largest){
             largest = num[i];
           }
         }
        System.out.println("Largest Value: "+largest);
        System.out.println("Sum of Elements: "+sum);
    }
}
