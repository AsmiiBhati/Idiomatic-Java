import java.util.Scanner;
public class CompoundInterest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle amount: ");
        double pri = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble() / 100;
        System.out.print("Enter years: ");
        int timeinyears = sc.nextInt();
        System.out.print("No. of times compouned: ");
        double timescom = sc.nextDouble();
        double amount;
        amount = pri * Math.pow(1 + (rate/timescom),timeinyears*timescom);
        // in java if you want a real symbol like % to be printed in printf you need to write it twice
        System.out.printf("Principle Amount: Rs. %f.\nRate of Interest: %f %%\n",pri,rate);
        System.out.printf("Time alotted: %d years\nTimes Compounded: %f\n",timeinyears,timescom);
        System.out.printf("Total amount to be paid: Rs. %f",amount);
        System.out.printf(" i.e. Rs. %.3f (approx.)",amount);
        sc.close();
    }
}