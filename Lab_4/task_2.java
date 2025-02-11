package Lab_4;
import java.util.*;

class Grade{

       public String name;
       public int roll;
       public String grade;
       public int numbers_of_subject;
       public float sum_marks;

       public Grade(String name,int roll,int numbers_of_subject)
       {
          this.name=name;
          this.roll=roll;
          this.numbers_of_subject=numbers_of_subject;
       }

       public void Set_marks()
       { 
         sum_marks=0;
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter marks of subjects :");
         
         for(int i=0;i<numbers_of_subject;i++)
         {
            int x =sc.nextInt();
            sum_marks+=x;
         }
         get_aver();

       }

       public float get_aver()
       {
          return sum_marks/(float)numbers_of_subject;
       }

       public void Grade_Calculation()
       {
          if (get_aver()>=80.0){
               System.out.println("A+");
          } 
          else if(get_aver()>=70.0 && get_aver()<80.0) {
               System.out.println("A");
          }
          else if(get_aver()>=60.0 && get_aver()<70.0) {
           System.out.println("A-");
          }
          else if(get_aver()>=50.0 && get_aver()<60.0) {
           System.out.println("B");
          }
          else if(get_aver()>=40.0 && get_aver()<50.0) {
           System.out.println("C");
          }
          else   System.out.println("F");
       }

       public void display()
       {
           System.out.println("Name :"+name +"\nRoll :"+roll);
           Grade_Calculation();
       }
     }
     
public class task_2 {

     public static void main(String[] args) {

        Grade[] stu = new Grade[3];
        for(int i=0;i<3;i++)
        {
           Scanner sc =new Scanner(System.in);

           System.out.print("Enter name-");
           String n =sc.nextLine();
           System.out.print("Enter roll-");
           int r=sc.nextInt();

           stu[i]=new Grade(n, r,3);
           stu[i].Set_marks();
        }

        for (int i=0;i<3;i++)
        {
            Grade grade=stu[i];
            grade.display();
            System.out.println();
        }

//        Grade stu1 =new Grade("goku",2,3);
//        stu1.Set_marks();
//        stu1.Grade_Calculation()
     }
}
