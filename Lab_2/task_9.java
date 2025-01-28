package Lab_2;
import java.util.Scanner;
public class task_9 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        System.out.println("Using concat(): " + string1.concat(string2));
        System.out.println("Using + operator: " + string1 + string2);

        scanner.close();
    }
}

