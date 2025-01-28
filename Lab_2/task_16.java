package Lab_2;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;
import java.util.*;
public class task_16 {
    
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        Map<Character, Integer> freqmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (freqmap.containsKey(s.charAt(i))) {

                int n = freqmap.get(s.charAt(i)) + 1;
                freqmap.put(s.charAt(i), n);
            } 
            else 
            {
                freqmap.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry Char : freqmap.entrySet()) {
            System.out.println(Char.getKey() + " " + Char.getValue());
        }
        // System.out.println(freqmap);

        scanner.close();
    }
}


