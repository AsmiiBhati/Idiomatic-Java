import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(0,21);
        int guess = 0;
        int attempts = 0;

        do
        {
            System.out.print("Guess the number(between 0 to 20): ");
            guess = sc.nextInt();
            attempts++;
            if(attempts >=4)
            {
                System.out.println("You've reached the limit of attempts!");
                System.out.println("The number was " + random);
                break;
            }
            if(guess>number)
            {
                System.out.println("oops! too high");
            }
            else if(guess<number)
            {
                System.out.println("oops! too low");
            }  
            else
            {
                System.out.println("You've guessed it right!");
                System.out.printf("you took %d attempts.",attempts);
            } 
        }   
        while(guess!= number);
        sc.close();
    }
}
