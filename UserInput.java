import java.util.Scanner; //util is the package called utility and scanner is a class.
public class UserInput //scanner allows us to take user input.
{
    public static void main(String[] args)
    {
        //for scanner class we will create a scanner object(sc in this case).
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name:");    
        //println takes user input in next line, print takes user in same line.
        String name = sc.nextLine();
        /* nextLine reads the string including the spaces 
        sc.next() is used if we don't want any spaces, but it won't read anything after the space then.*/

        System.out.print("Enter age:");
        int age = sc.nextInt(); //reads integers
        
        System.out.print("Are you a Student (true or false):");
        boolean isStudent = sc.nextBoolean();
    
        if(isStudent)
        {
        System.out.print("Enter SGPA:");
        double sgpa = sc.nextDouble(); //reads double values

        System.out.println("Hello! " + name);
        System.out.println("Your Age is " + age);
        System.out.println("Your SGPA is " + sgpa);
        }
        else
        {
            System.out.println("Hello! " + name);
            System.out.println("Your Age is " + age);
        }
        sc.close();
    }
}
