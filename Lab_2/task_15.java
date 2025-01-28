package Lab_2;
import java.util.Scanner;
public class task_15 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of new messages: ");
        int messages = scanner.nextInt();

        String formattedString = String.format("Hello, %s! You have %d new messages.", name, messages);
        System.out.println(formattedString);

        scanner.close();
    }
}


