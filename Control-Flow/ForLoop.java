import java.util.Scanner;
public class ForLoop
{
    public static void main(String[] args) throws InterruptedException //intermeditate java concept
    // throws interruptedException is used to handle exceptions where thread mathod running is
    // interrupted whiles it running, waiting or in general paused
    {
        Scanner sc = new Scanner(System.in);
        // for loop: executes some code for a certain amount of time
        // for(loop control variable;condition;increment or decrement)
        for(int i = 1;i<=10;i++)
        {
            System.out.print(i+"\n");
            Thread.sleep(1000); // advanced java concept
            // this is a class which can be used to put a time gap between printing
            // it allows program to sleep for a specific amount of milliseconds
        }
        System.out.print("Enter first number:");
        int j = sc.nextInt();
        System.out.print("Enter last number:");
        int k = sc.nextInt();
        
        for(int m = j;m<=k;m++) // we use m since j can't be initialized othwerwise.
        {
            System.out.println(m*2);
        }
        sc.close();
    }
}
