package Lab_2;
import java.util.Scanner;
public class task_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string:");
        String s= scanner.nextLine();
        
        String rString = new StringBuilder(s).reverse().toString();

        System.out.println(s +" "+ rString);

        if (s.equals(rString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}


