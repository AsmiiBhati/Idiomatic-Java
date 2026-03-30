import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "yes";
        //welcome
        System.out.println("Welcome to Rock,Paper and Scissors!");
        do
        {
            //array of rock paper and scissors
            String[] choices = {"rock","paper","scissors"};
            //random and user chooses from same array
            System.out.print("pick your choice: ");
            String userPick = sc.nextLine().toLowerCase();
            while(!userPick.equals("rock") && !userPick.equals("paper")  && !userPick.equals("scissors"))
            {
               System.out.println("Invalid Choice!"); 
               System.out.print("pick your choice: ");
               userPick = sc.nextLine().toLowerCase();
            }
            String compPick = choices[random.nextInt(3)];
            System.out.println("User Pick: "+userPick);
            System.out.println("Computer Pick: "+compPick);

            if(userPick.equals(compPick)) // can't use == because thsi compares the memory address
                {
                    System.out.println("Its a tie!");
                }
            else if((userPick.equals("rock") && compPick.equals("scissors")) || 
                        (userPick.equals("paper") && compPick.equals("rock")) ||
                        (userPick.equals("scissors") && compPick.equals("paper")))
                {
                    System.out.println("You win!");
                }
            else
                {
                    System.out.println("You lose!");
                }
            System.out.print("Do you want to play again? ");
            playAgain = sc.nextLine();
            if(playAgain.equals("no"))
            {
                System.out.println("exit!");
                break;
            }
        }
        while(playAgain.equals("yes"));
        sc.close();
    }    
}
