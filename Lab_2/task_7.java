package Lab_2;
import java.util.Scanner;
public class task_7 {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

         if(s1.equals(s2))
          System.out.println("string are equals using equals()");
         else 
         System.out.println("string are not equals using equals()");

         if(s1.equalsIgnoreCase(s2))
         System.out.println("string are equals using equalsIngnoreCase()");
        else 
        System.out.println("string are not equals using equalsIgnoreCase()");
        
        scanner.close();
    }
}


