package Linked_list;
import Linked_list.linked_list.*;
public class LL_palindrome {

    public Node findmiddle(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node reverse(Node head)
    {
       Node prev=null;
         Node curr=head;
            Node next=null; 
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public boolean palin(linked_list list)
    {
        Node first_half= list.head;
        Node middle=findmiddle(list.head);
        Node Sec_half=reverse(middle);

        while(Sec_half!=null)
        {
            if(first_half.data!=Sec_half.data)
            {
                return false;
            }
            first_half=first_half.next;
            Sec_half=Sec_half.next;
        }
        return true;
    }

    public void main(String[] args) 
    {
        linked_list list=new linked_list();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("2");
        list.addFirst("1");

        if(palin(list))
        System.out.println("it is palindrome");
        else
        System.out.println("it is not palindrome");
      
    }
	
}
