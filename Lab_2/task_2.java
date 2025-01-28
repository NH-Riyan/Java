package Lab_2;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

         System.out.println("The character at index " + index + " is: " +  s.charAt(index));
        scanner.close();
    }
}

    