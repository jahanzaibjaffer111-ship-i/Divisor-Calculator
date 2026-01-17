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
            System.out.println("welcome to divisor calc");
            System.out.println("type value");
            a=read.nextInt();
            if(a==0)
            {
                System.out.println("value cant be zero");
                System.out.println("try again");
                System.out.println(".");
            }
            else if(a<0)
            {
                System.out.println("value cant be negative");
                System.out.println("try again");
                System.out.println(".");
            }
            else if (a>0)
            {
                System.out.println("values are");
                while(a>=b)
                {
                    if(a % b == 0)
                    {
                        System.out.println(b);
                    }
                    b++;
                }
                System.out.println("thanks");
                System.out.println("bye");
                System.out.println(".");   
            }
        }
    }
}