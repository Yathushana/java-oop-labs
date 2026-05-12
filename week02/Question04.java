package week02;

import java.util.Scanner;

// Program to convert seconds into hours, minutes, and seconds
public class Question04 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter an integer number of seconds: ");
        int seconds = sc.nextInt();

        int hours = seconds/3600;
        int minutes = (seconds % 3600)/60;
        int remainSec = seconds % 60;

        System.out.println("Hours = "+hours);
        System.out.println("Minutes = "+minutes);
        System.out.println("Seconda = "+remainSec);

    }
}
