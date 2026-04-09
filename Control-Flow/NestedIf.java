import java.util.Scanner;
public class NestedIf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Price of a movie ticket: Rs.100.");
        double amount = 100;
        System.out.print("Are you a student?(True/False): ");
        boolean isStudent = sc.nextBoolean();
        if(isStudent)
        {
            System.out.print("Are you a freshman?(True/False): ");
            boolean isFreshman = sc.nextBoolean();
            if(isFreshman)
            {
                System.out.println("You get a 30% discount!!");
                amount *= 0.7; // need to pay only 70%
                System.out.println("You only need to pay Rs."+amount);
            }
            else
            {
                System.out.println("You get a 10% discount!!");
                amount *= 0.9 ; // need to pay only 90%
                System.out.println("You only need to pay Rs."+amount);
            }
            
        }
        else
        {
            System.out.println("You need to pay Rs.100.");
        }
        System.out.println("Enjoy your movie!");
        sc.close();
    }
}
