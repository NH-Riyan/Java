// 6. Longest Word in a Sentence
//    * Write a program in Java to find and print the longest word in a sentence. Split the sentence into words and compare their lengths.

package Lab_3;
import java.util.*;
public class task_6 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split(" ");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        System.out.println("Longest word: " + longestWord);
        scanner.close();
    }
}

