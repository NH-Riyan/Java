package Lab_2;
import java.util.Scanner;
public class task_10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(",");

        System.out.println("The words in the sentence are:");

        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}

