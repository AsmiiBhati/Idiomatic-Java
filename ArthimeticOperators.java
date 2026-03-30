import java.util.Scanner;
public class ArthimeticOperators 
{
    public static void main(String[] args)
    {
      /*[without user input]
        int x = 10;
        int y = 2;
        int add, sub, pro, div, mod;

        add = x + y;
        sub = x-y;
        pro = x * y;
        div = x / y;
        mod = x % y;

        System.out.println("*Basic Arthimetic Operations without user input*");
        System.out.println("Sum of 10 and 2 is " + add);
        System.out.println("Difference between 10 and 2 is " + sub);
        System.out.println("Product of 10 and 2 is " + pro);
        System.out.println("Division of 10 from 2 is " + div);
        System.out.println("Modulus of 10 and 2 is " + mod); */

        //[with user input]
        Scanner sc = new Scanner(System.in);

        int x,y,add,sub,pro,div,mod;

        System.out.print("Enter first integer:");
        x = sc.nextInt();
        System.out.print("Enter second integer:");
        y = sc.nextInt();

        add = x+y;
        pro = x*y;
        if(x>y)
        {
            sub = x-y;
            div = x/y;
            mod = x%y;
        }
        else
        {
            sub = y-x;
            div = y/x;
            mod = y%x;
        }

        System.out.println("*Basic Arthimetic Operations with user input*");
        System.out.println("Sum of is " + add);
        System.out.println("Difference is " + sub);
        System.out.println("Product is " + pro);
        System.out.println("Division is " + div);
        System.out.println("Modulus is " + mod);
        sc.close();
    } 
//we can also use switch case if the user wants only specific operation to be displayed.
}