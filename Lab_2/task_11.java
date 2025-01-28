package Lab_2;
import java.util.Scanner;
public class task_11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter a character to find: ");
        char ch = scanner.next().charAt(0);
   
        System.out.println("First occurrence of '" + ch + "': " + s.indexOf(ch));
        System.out.println("Last occurrence of '" + ch + "': " + s.lastIndexOf(ch));
    

        scanner.close();
    }
}

