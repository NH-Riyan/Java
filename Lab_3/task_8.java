// 8. String Compression
//    * Write a program in Java to compresses a string by counting consecutive repeated characters. Example: "aaabbcc" → "a3b2c2".

package Lab_3;

import java.util.*;

public class task_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
    
        HashMap<Character, Integer> freq
            = new HashMap<Character, Integer>();
 
        char[] strArray = s.toCharArray();

        for (char ch : strArray) {
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            }
            else {
                freq.put(ch, 1);
            }
        }
        for(Map.Entry<Character, Integer> ele: freq.entrySet())
        {
            System.out.print(ele.getKey()+""+ele.getValue());
        }
        scanner.close();
    }
}
