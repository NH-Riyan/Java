package Lab_2;
import java.util.Scanner;
public class task_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1= scanner.next();
        String s2="aeiouAEIOU";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < s1.length(); i++)
         {
            char ch = s1.charAt(i);
                if (s2.indexOf(ch) != -1) 
                    vowels++;
                else 
                    consonants++;
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        scanner.close();
    }
}


