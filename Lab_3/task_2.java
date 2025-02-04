// 2. Capitalize Each Word
//    * Write a program in Java to accept a sentence and capitalize the first letter of each word.


package Lab_3;
import java.util.Scanner;
public class task_2 {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String s = scanner.nextLine();
        
        scanner.close();
        
        String[] words = s.split(" ");
        String result = "";
        
        for (String word : words) {
            if (!word.isEmpty()) {
                result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
        }
        
        System.out.println(result);
        
    }
}
