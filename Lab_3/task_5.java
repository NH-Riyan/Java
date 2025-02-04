// 5. Anagram Check
//    * Write a program in Java to check if two strings are anagrams . Sort both strings and compare them.


package Lab_3;

import java.util.*;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();
    
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        String new_s1= new String(charArray1);
        String new_s2 = new String(charArray2);

        if(new_s1.equals(new_s2))
        System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

        scanner.close();
    }
}
