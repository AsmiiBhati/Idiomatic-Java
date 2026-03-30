import java.util.Scanner;
public class BankingProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Initial Balance: ");
        double balance = sc.nextInt();

        boolean isWorking = true;//this will keep it running in a loop until exit
        double deposit = 0;
        double withdraw = 0;

        while(isWorking)
        {
            System.out.println("+---------------------------------+");
            System.out.println("       Our Banking Program");
            System.out.println("+---------------------------------+");
            System.out.println("Choose servives:");
            System.out.println("1.Show Balance\n2.Deposit\n3.Withdraw\n4.Exit");
            System.out.print("Enter option: ");
            int option = sc.nextInt();
            switch(option)
            {
                case 1 -> 
                { 
                    System.out.println("*SHOW BALANCE*");
                    showBalance(balance);
                }
                case 2 -> 
                {
                    System.out.println("*DEPOSIT*");
                    balance = deposit(balance,deposit,sc);
                }   
                case 3 -> 
                {
                    System.out.println("*WITHDRAW*");
                    balance = withdraw(balance,withdraw,sc);
                }    
                case 4 -> 
                {
                    System.out.println("EXIT.Thank You!");
                    isWorking = false;
                }    
                default -> System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
    static void showBalance(double balance)
    {
        System.out.println("Balance is: Rs." + balance);
    }
    static double deposit(double balance,double deposit,Scanner sc)
    {
        System.out.print("Money to deposit: ");
        deposit = sc.nextInt();
        System.out.println("Money Deposited: Rs. " + deposit);
        balance = deposit + balance;
        System.out.println("New Balance: "+ balance);
        return balance;
    }
    static double withdraw(double balance,double withdraw,Scanner sc)
    {
        System.out.println("Money to withdraw: ");
        withdraw = sc.nextInt();
        if(balance>withdraw)
        {
            System.out.println("Money Withdrawed: Rs. "+withdraw);
            balance = balance - withdraw;
            System.out.println("New Balance: Rs."+balance);
            return balance;
        }
        else
        {
            System.out.println("Insufficient Balance!");
            System.out.println("Balance: "+balance);
            return balance;
        }
    }
}
