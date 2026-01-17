import java.util.Scanner;
public class divisor_calculator_using_for
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        while(true)
        {
            System.out.println("hello");
            System.out.println("welcome to divisor calc");
            System.out.println("type value");
            a=read.nextInt();
            b=1;
            if(a==0)
            {
                System.out.println("value cant be negative");
                System.out.println("try again");
                System.out.println(".");
            }
            else if(a<0)
            {
                System.out.println("value cant be zero");
                System.out.println("try again");
                System.out.println(".");
            }
            else if(a>0)
            {
                System.out.println("divisors are");
                for(int i=b; i<=a; i++)
                    if(a%i==0)
                    {
                        System.out.println(i);
                    }

                System.out.println("Thanks");
                System.out.println("bye");
                System.out.println(".");
            }
        }
    }

}
