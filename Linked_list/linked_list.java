package Linked_list;

public class linked_list {

    public Node head;
    public int size;
     linked_list()
     {
        size=0;
     }
    
  public class Node
    {
        String data;
        Node next;

        Node(){};
        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

//addFirst
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        //size++;
    }

// add in a specific index
    public void addmiddle(int index,String data)
    {
        if(index<0 || index>size)
        {
            System.out.println("Invalid");
            return;
        }
        //size++;

        Node newNode=new Node (data);
        if(head==null || index==0)
        {
            newNode.next=head;
            head=newNode;
            return;
        }

        Node currNode=head;
        for(int i=1;i<size;i++)
        {
            if(i==index)
            {
                Node nextNode=currNode.next;
                currNode.next=newNode;
                newNode.next=nextNode;
                break;
            }
            currNode=currNode.next;
        }
    }

//addLast
     public void addLast(String data)
     {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next!=null) {
            currNode=currNode.next; 
        }

        currNode.next=newNode;
         //size++;
     }

// remove the first element
     public void removeFirst()
     {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }

        head=head.next;
        size--;

     }

// remove the last element 
     public void removeLast()
     {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
         size--;
        if(head.next==null)
        {
            head=null;
            return;
        }


        Node currNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
            currNode=currNode.next;
            lastNode=lastNode.next ;
        }
        currNode.next=null;   
     }

// to get size
     public int getsize()
     {
        return size;
     }

// to display the list
     public void print()
     {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next; 
        }
        System.out.println("Null");

     }

    public static void main(String [] args)
    {
        linked_list list = new linked_list();
        list.addFirst("b");
        list.addFirst("a");
        list.addLast("d");
        list.print();
        list.removeLast();
        list.print();
        list.addLast("P");
        list.print();
        System.out.println(list.getsize());


    }
}

