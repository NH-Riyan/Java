
// 4. Sort Characters in a String
//    * Write a program in Java to sort the characters of a string in ascending order.

package Lab_3;
import java.util.*;


public class task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        
        
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        
        String sortedString = new String(charArray);
        System.out.println("Sorted String: " + sortedString);
        
        scanner.close();
    }
}
