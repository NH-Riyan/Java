// 1. Word Count
//    * Write a program in Java to accept a sentence and count the number of words in it using split().


package Lab_3;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String s = scanner.nextLine();  
        
        String[] words = s.trim().split(" ");
        
        System.out.println("Number of words: " + words.length);

        scanner.close();
    }
}
