import java.util.*;

public class lab_1 {
    // -------------------------------1--------------------------------//
    static void max_min()
    {
       Scanner sc = new Scanner(System.in);
       int a,b;
       System.out.println("Finding max and min");
       a = sc.nextInt();
       b=sc.nextInt();
       System.out.println("max :"+Math.max(a,b)+" min :"+Math.min(a,b));
    }
    // -------------------------------2--------------------------------//
    static void abs_value(){
       System.out.println("abosulate value");
       Scanner sc = new Scanner(System.in);
       int a;
       a = sc.nextInt();
       System.out.println("Absolute value :"+ Math.abs(a));
    }
    // -------------------------------3--------------------------------//
    static void square()
    {
       System.out.println("Square value");
       Scanner sc = new Scanner(System.in);
       int a;
       a = sc.nextInt();
       if(a>0)
       System.out.println("square value :"+ Math.sqrt(a));
       else 
       System.out.println("Error");
    }
    // -------------------------------4--------------------------------//
    static void power()
    {
        System.out.println("Power value");
       Scanner sc = new Scanner(System.in);
       int a,b;   
       a = sc.nextInt();
       b=sc.nextInt();
       System.out.println("Power calculation"+Math.pow(a,b));
    }
    // -------------------------------5--------------------------------//
    static void CFR(){
        
        System.out.println("Ceil,Floor and Round");
        Scanner sc = new Scanner(System.in);
        Float a;
        a = sc.nextFloat();
        System.out.println("Ceil"+ Math.ceil(a));
        System.out.println("Floor"+ Math.floor(a));
        System.out.println("Round"+ Math.round(a));   
     }
    // -------------------------------6--------------------------------//
     static void random_num()
     {
        System.out.println("10 Random Numbers");
         Random rand = new Random();
        for(int i=0;i<10;i++)
        {
        int rand_int = rand.nextInt(100);
        System.out.println("Random num :"+rand_int);
        }
    }
    // -------------------------------7--------------------------------//
    static void trigonometric(){

        System.out.println("Trigonometric value");
        Scanner sc = new Scanner(System.in);
        Float a;
        a = sc.nextFloat();
        double r=Math.toRadians(a);
        System.out.printf("sine:%.3f\n", Math.sin(r));
        System.out.printf("cosine:%.3f\n", Math.cos(r));
        System.out.printf("tan:%.3f\n",Math.tan(r));
        System.out.printf("Randian: %.3f", r );    
     }
    // -------------------------------8--------------------------------//
     static void log()
     {
       System.out.println("logarithm value");
       Scanner sc = new Scanner(System.in);
       int a;
       a = sc.nextInt();
       System.out.println("logarithm:"+ Math.log(a));
       System.out.println("base-10 logarithm:"+ Math.log10(a));

     }
    // -------------------------------9--------------------------------//
      static void Exponential()
      { 
        System.out.println("Exponential value");
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        System.out.printf("exponential: %.3f" ,Math.exp(a));
      }
    // -------------------------------10--------------------------------//
      static void hypotenuse()
      {
       System.out.println("Hypotenuse");
       Scanner sc = new Scanner(System.in);
       int a,b;   
       a = sc.nextInt();
       b=sc.nextInt();
       System.out.println("Hypotenuse:"+ Math.hypot(a,b));
      }
    // -------------------------------11--------------------------------//  
      static void circle_cal()
      {
       System.out.println("Circle calculation");
       Scanner sc = new Scanner(System.in);
       int r;   
       r = sc.nextInt();
       System.out.println("the area:"+(Math.PI*r*r) );
       System.out.println("the circumference: "+ 2*Math.PI*r);
      }
    // -------------------------------12--------------------------------//
      static void quadratic_equ()
    {
       System.out.println("Quadractic equation");
       Scanner sc = new Scanner(System.in);
       int a,b,c;   
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
      if(a==0) 
       System.out.println("Not a quadratic Equation");
      else
      {
         double d=Math.pow(b,2)-4*a*c;
         if(d>0)
         {
           double res_1=(-b+Math.sqrt(d))/(2*a);
           double res_2=(-b-Math.sqrt(d))/(2*a);
           System.out.println("root-1(+):"+res_1+"\troot-2(-):"+res_2);
         }
         else if(d==0)
         {
          double res_1=(-b)/(2*a);
          System.out.printf("One root : %.3f",res_1);
         }
         else 
         {
            double real_part=-b/(2*a);
            double imaginary_part=Math.sqrt(-d)/(2*a);
            System.out.printf("root-1 : %.2f+%.2fi \n",real_part,imaginary_part);
            System.out.printf("root-1 : %.2f-%.2fi",real_part,imaginary_part);
         }
      }
    }
    // -------------------------------13--------------------------------//
    static void angle_conversion()
    {
        System.out.println("Angle conversion");
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("degree to radian :");
        a = sc.nextDouble();
        System.out.println("Randian:"+ Math.toRadians(a));
        System.out.println("radian to degree :");
        b =sc.nextDouble();
        System.out.printf("Degree: %.3f", Math.toDegrees(b));
    }
    // -------------------------------14--------------------------------//
    static void cus_random_num()
     {
        System.out.println("Custom Random Number");
        Random rand = new Random();
        int rand_int = rand.nextInt(50,100);
        System.out.println("Custom Random Number(50-100) : "+rand_int);
     }
    // -------------------------------15--------------------------------//
     static void dis_between_points()
     {
       System.out.println("Distance Between points");
       int x1,x2,y1,y2;   
       Scanner sc = new Scanner(System.in);
       x1 = sc.nextInt();
       y1=sc.nextInt();
       x2=sc.nextInt();
       y2=sc.nextInt();

       double res=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
       System.out.printf("Distance between 2 points : %.2f ",res);
     }
    // -------------------------------16--------------------------------//
     static void dice_simulation()
     {
        System.out.println("Dice Simulation");

         int rolls=1000;
         int num[]=new int [13];

         Random ran= new Random();

         for(int i=0;i<1000;i++)
         {
            int dice1=ran.nextInt(1,7);
            int dice2=ran.nextInt(1,7);
            num[dice1+dice2]++;
         }

        //  double sum = 0;
         for(int i=2;i<13;i++)
         {
           double percentage = (num[i]/(double)rolls)*100;
        //    sum += percentage;
           System.out.printf("num : %d \t percentage : %.2f \n",i,percentage);
         }
        //  System.out.println("sum :"+ sum);
     }



    public static void main( String []args)
    {
         //1  
         max_min();
         //2
         abs_value();
         //3
         square();
         //4
         power();
         //5
         CFR();
         //6
         random_num();
         //7
         trigonometric();
         //8
         log();
         //9
         Exponential();
         //10
         hypotenuse();
         //11 
         circle_cal();
         //12
         quadratic_equ();
         //13
         angle_conversion();
         //14
         cus_random_num();
         //15 
         dis_between_points();
         //16
         dice_simulation();
    }
}
