package week02;
// Program to count words, find longest word, and reverse a sentence
import java.util.Scanner;

public class Question03 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String [] words = sentence.split(" ");

        System.out.println("Word count = "+words.length);
        String longest = words[0];

        for(int i = 0 ; i< words.length; i++){
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }
    }
}
