import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        double result = 0; // this zero is used just to initialize the result, so that it doesn't show error
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number:");
        double firstnum = sc.nextDouble();
        System.out.print("Enter the operation(+ - * / %): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double secnum = sc.nextDouble();
        boolean valid = true;

        switch(operator)
        {
            case '+' -> result = firstnum + secnum;
            case '-' -> result = firstnum - secnum;
            case '*' -> result = firstnum * secnum;
            case '/' -> 
            {
                if(secnum == 0)
                    {
                        System.out.println("You shouldn't divide a number by 0.");
                        valid = false;
                    }
                    else
                    {
                        result = firstnum / secnum;
                    }
            }
            case '%' -> 
            {
                if(secnum == 0)
                {
                    System.out.println("You shouldn't divide a number by 0.");
                    valid = false;
                }
                else
                {
                    result = firstnum % secnum;
                }
            }
            default ->
            {
                System.out.println("That's not an operator");
                valid = false;
            }
        }
        if(valid)
        {
            System.out.println("Result is "+ result);
        }
        else
        {
            System.out.println("Not valid input");
        }    
        sc.close();
    }
}
