// 3. Replace Spaces with a Character
//    * Write a program in Java to accept a sentence and replace all spaces with a specified character using replace().

package Lab_3;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = scanner.nextLine();
        
        System.out.print("Enter a character to replace spaces: ");
        char replacement = scanner.next().charAt(0); 
        
        String result = s.replace(' ', replacement);
        
        System.out.println("Modified Sentence: " + result);
        scanner.close();
    }
}
