import java.util.*;


public class recursion_2{

    static void rec(Stack<Integer> s)
    {
        if(s.size()==0)
        {
            return ;
        }
        rec(s);
        int top=s.pop();
        s.push(top);
        
        
    }
    public static void main(String[] a) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        rec(st);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();    
        }
    }
}
        
   