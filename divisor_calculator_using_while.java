import java.util.Scanner;
public class divisor_calculator_using_while
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        
        
        while(true)
        {
            b=1;
            System.out.println("Hello");
            System.out.println("Welcome to Divisor Calculator");
            System.out.println("Type a Value");
            a=read.nextInt();
            if(a==0)
            {
                System.out.println("Value can't be zero");
                System.out.println("Try again");
                System.out.println(".");
            }
            else if(a<0)
            {
                System.out.println("Value can't be negative");
                System.out.println("Try again");
                System.out.println(".");
            }
            else if (a>0)
            {
                System.out.println("Divisors are");
                while(a>=b)
                {
                    if(a % b == 0)
                    {
                        System.out.println(b);
                    }
                    b++;
                }
                System.out.println("Thank you");
                System.out.println("Bye");
                System.out.println(".");   
            }
        }
    }

}
