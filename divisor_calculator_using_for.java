import java.util.Scanner;
public class divisor_calculator_using_for
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        while(true)
        {
            System.out.println("Hello");
            System.out.println("Welcome to Divisor Calculator");
            System.out.println("Type a Value");
            a=read.nextInt();
            b=1;
            if(a==0)
            {
                System.out.println("value can't be zero");
                System.out.println("Try again");
                System.out.println(".");
            }
            else if(a<0)
            {
                System.out.println("value can't be negative");
                System.out.println("Try again");
                System.out.println(".");
            }
            else if(a>0)
            {
                System.out.println("Divisors are");
                for(int i=b; i<=a; i++)
                    if(a%i==0)
                    {
                        System.out.println(i);
                    }

                System.out.println("Thank you");
                System.out.println("Bye");
                System.out.println(".");
            }
        }
    }

}



