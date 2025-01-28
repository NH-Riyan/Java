package Lab_2;
import java.util.Scanner;
public class task_12 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        StringBuilder st= new StringBuilder(s);

        System.out.println("Reversed (using StringBuilder): " + st.reverse());

        scanner.close();
    }
}


