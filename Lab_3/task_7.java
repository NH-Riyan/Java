// 7. Check for Rotation
//    * Write a program in Java to check if one string is a rotation of another. For example, "abcde" and "cdeab" are rotations.

package Lab_3;
import java.util.*;
public class task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
        
        scanner.close();
    }
}

