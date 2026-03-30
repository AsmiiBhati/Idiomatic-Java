import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        //Exception = an event that interrupts normal flow ofprogram
        //(divide by zero,file not found,mismatch input type)
        //Surround any dangerous code in a try{} block
        //try{},catch{},finally{}(optional)
        //Scanner sc = new Scanner(System.in); instead of using it outside we can declare it inside the try method, then java will automatically close it after its done.. and we won't have to write sc.close();
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println(num);
        }
        catch(InputMismatchException i)
        {
            System.out.println("That wasn't a number.");
        }
        
        try
        {
            System.out.println(1/0);
        }
        //if we have a try{} block we'll also need a catch{} box
        catch(ArithmeticException a)
        {
            System.out.println("You can't divide by ZERO!");
        }
        //we can add more than one catch block to handle specific exceptions.
        
        catch(Exception e)//using just this isn't good practice but if anexception jumps all other specific handling methods, this can be used to handle it (Saftey net for problems we can't predict)
        {
            System.out.println("Some sort of exception occurred!");
        }
        finally //used to clean up (contains file closures etc)
        {
            //sc.close();
            System.out.println("A finally{} block always executes!");
        }
        
    }
}
