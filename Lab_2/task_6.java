package Lab_2;
 import java.util.Scanner;
public class task_6 {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);

        System.out.print("Enter the replacement character: ");
        char newChar = scanner.next().charAt(0);

        String new_s = s.replace(oldChar, newChar);

        System.out.println("Original String: " + s);
        System.out.println("Modified String: " +new_s);

        scanner.close();
    }
}


