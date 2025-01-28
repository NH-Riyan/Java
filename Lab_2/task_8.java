package Lab_2;
 import java.util.Scanner;
public class task_8 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String string = scanner.nextLine();

        System.out.print("Enter the substring to check: ");
        String subString = scanner.nextLine();

        if (string.contains(subString)) {
            System.out.println("The main string contains the substring.");
        } else {
            System.out.println("The main string does not contain the substring.");
        }
        scanner.close();
    }
}

