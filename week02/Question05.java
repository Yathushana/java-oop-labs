package week02;

import java.util.Scanner;

public class Question05 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        String [] words = new String[5];

        System.out.println("Enter a words: ");
         int totalChar =0;
        for(int i =0; i<5; i++){
            words[i] = sc.nextLine();
        }
        String longest = words[0];

        for(int i=0; i<5; i++){
            totalChar = totalChar + words[i].length();
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }
        System.out.println("Longest word = "+longest);
        System.out.println("Total Characters = "+totalChar);
        System.out.println("Even lenth words: ");

        for(int i =0;i<5;i++){
            if(words[i].length() % 2 ==0){
                System.out.println(words[i]);
            }
        }
    }
}
