import java.util.Scanner;
public class Conditions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.nextLine();

        if(name.isEmpty())
        {
            System.out.println("You didn't enter your name!!");
        }
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        if(age>=65)
        {
            System.out.println("You are a senior!");
        }
        else if(age>=18)
        {
            System.out.println("You are an adult!");
        }
        else if(age==0)
        {
            System.out.println("You are a baby!");
        }
        else if(age<0)
        {
            System.out.println("invalid input");
        }
        else if(age<18)
        {
            System.out.println("You are a child!");
        }
        sc.close();
    }
}
