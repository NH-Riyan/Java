// it is a code to print all the combintion of a keypad number

public class recursion_1 {
    public static String[] keypad = {".","abc","dcf","ghi","jkl","mno","pqrs","tu","vwx","yz"};


     public static void print(String str,int idx,String combination)
     {
            if(idx==str.length())
            {
                System.out.println(combination);
                return;
            }
            String key = keypad[str.charAt(idx)-'0'];
    
            for(int i=0;i<key.length();i++)
            {
                print(str,idx+1,combination+key.charAt(i));
            }
        
     }

    public static void main(String[] args)
    {
        String str ="23";

        print(str, 0, "");


    }
}
