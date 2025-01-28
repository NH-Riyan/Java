package Lab_2;
import java.util.Scanner;
public class task_5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading or trailing spaces: ");
        String s= scanner.nextLine();

        System.out.println("Original String:"+ s);
        System.out.println("Trimmed String:"+s.trim());

        scanner.close();
    }
}

