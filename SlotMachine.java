import java.util.Random;
import java.util.Scanner;

public class SlotMachine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter existing balance: ");
        int balance = sc.nextInt();
        int bet;
        String[] row;
        //play only if balance>0
        while(balance<=0)
        {
            System.out.println("invalid balance!");
            System.out.print("Enter existing balance: ");
            balance = sc.nextInt();
        }
        System.out.println("+----------------------------+");
        System.out.println(" Welcome to the Slot Machine!");
        System.out.println("+----------------------------+");
        System.out.println("Symbols: @ # $ % &");
        while(balance>0)
        {
            System.out.println("Your current balance: "+balance);
            System.out.print("your bet: ");
            bet = sc.nextInt();
            sc.nextLine();//to remove \n buffer after nextInt,orelse it'll get read in nextLine
            while(0>=bet || bet>balance)
            {
                System.out.println("Invalid Bet!");
                System.out.print("your bet: ");
                bet = sc.nextInt();
                sc.nextLine();//to remove \n buffer after nextInt,orelse it'll get read in nextLine
            }
            balance -= bet;
            System.out.println("Spinning....");
            row = spinRow();
            int payout = payout(row,bet);
            if(payout>0)
            {
                System.out.println("You won $ "+payout);
                balance += payout;
            }
            else
            {
                System.out.println("You lost!");
                System.out.println("Your balance: $ " + balance);
            }
            System.out.print("Do you want to play again? ");
            String playAgain = sc.nextLine().toLowerCase();
            if(playAgain.equals("no"))
            {
                System.out.println("Thank you for playing!");
                System.out.println("Your balance: $ " + balance);
                break;
            }
        }
        sc.close();
    } 
    static String[] spinRow()
    {
        String[] symbols = {"@", "#", "$" ,"%", "&"};
        String[] row = new String[3];

        Random random = new Random();

        for(int i = 0;i<3;i++)
        {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        System.out.println("      Your Slots!");
        System.out.println("+-----------------------+");
        System.out.print("|   "+row[0]+"   |   "+row[1]+"   |   "+row[2]+ "   |\n");
        System.out.println("+-----------------------+");
        return row;
    }
    static int payout(String[] row, int bet)
    {
        if(row[0].equals(row[1]) && row[1].equals(row[2]))
        {
            return switch(row[0])
            {
                case "@" -> bet*2;
                case "#" -> bet*3;
                case "$" -> bet*4;
                case "%" -> bet*5;
                case "&" -> bet*6;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1]) || row[1].equals(row[2]) || row[0].equals(row[2]))
        {
            bet = bet*2;
            return bet;
        }
        return 0;
    }
}