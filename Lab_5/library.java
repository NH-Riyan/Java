import java.util.*;

class Book
{
    String title, author;
    boolean isAvailable;
    String type;

    Book(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.isAvailable = true;
    }

    public String isAvail()
    {
        if(this.isAvailable)
           return "Available";
        else
            return "Not available";
    }
}

class Lib
{
    int days=5;
    static Book[] books = {
            new Book("OOP", "tom", "printed"),
            new Book("DC", "Goku", "printed"),
            new Book("DLD", "thanos", "printed"),
            new Book("Math", "kanye", "e-book"),
            new Book("Stat", "tommy", "printed")
    };

   public void searchBook(String title)
   {
        for (Book book : books)
        {
            if (book.title == title)
            {
                System.out.println("Title: "+book.title);
                System.out.println("Author :"+book.author);
                System.out.println("Status :"+book.isAvail());
                System.out.println();
                return;
            }
        }
        System.out.println("Book is not found");
    }

}

class Users extends Lib
{
    String user;
    Book [] borrowed_books  ;
    int bookstaken=0;

    Users(String user,int maxbooks)
    {
        this.user=user;
        this.borrowed_books=new Book[maxbooks];
    }

     public void borrow(String title)
     {
         if ((user == "Student" && bookstaken <2) || (user == "Teacher" && bookstaken < 3))
         {
             for (int i = 0; i < books.length; i++)
             {
                 if (books[i].title == title && books[i].isAvailable)
                 {
                     System.out.println("Borrowed");
                     borrowed_books[bookstaken]=books[i];
                     books[i].isAvailable = false;
                     bookstaken++;
                     return;
                 }
             }
             System.out.println("Not available at this moment");
         }
         else
         {
             System.out.println("You have already borrowed maximum books");
         }
     }

     public void Return(String title,int time)
     {
         for (int i = 0; i < borrowed_books.length; i++)
         {
              if (borrowed_books[i].title == title )
              {
              System.out.println("Book Returned");
              borrowed_books[i].isAvailable = true;
              bookstaken--;

              if(borrowed_books[i].type=="printed" && user== "Student" && time>days )
                {
                   System.out.println("Fine : "+(double)((time-days)*5)/2 +"tk");
                }
              else
                {
                   System.out.println("NO fine");
                }
               return;
              }
    }
         System.out.println("You did not borrow it");
}
public void showlist()
{
    if(bookstaken>0)
    for (int i=0;i<bookstaken;i++)
    {
        System.out.println("Title :"+borrowed_books[i].title);
    }
    else
    {
        System.out.println("Empty List");
    }
}
}

class Students extends Users
{
    Students()
    {
        super("Student",2);
    }

}

class Teachers extends Users
{

    Teachers()
    {
        super("Teacher",3);
    }

}


public class library {
    public static void main(String [] args)
    {
        Students s =new Students();
        Students s2 =new Students();
        Teachers t =new Teachers();

        s.borrow("DC");
        s.borrow("DLD");
        s.showlist();

        s2.borrow("OOP");
        s2.searchBook("DC");
        s2.showlist();

        s.Return("DC",10);
        s.Return("DLD",4);

        t.borrow("Stat");
        t.borrow("DC");
        t.borrow("DLD");
        t.showlist();
        t.Return("Stat",25);
    }
}
