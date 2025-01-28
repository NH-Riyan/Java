package Lab_2;
import java.util.Scanner;
public class task_4 {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

            String substring = s.substring(startIndex, endIndex);
            System.out.println("The extracted substring is: " + substring);

        scanner.close();
    }
}

