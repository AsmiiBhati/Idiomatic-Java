import java.util.Scanner;
public class WeightConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double weight, newweight;
        int choice;

        System.out.println("Welcome!\n This is a weight converter program.");
        System.out.println("1. Convert lbs into kgs.\n2. Convert kgs to lbs.");
        System.out.print("Enter Choice(1 or 2): ");
        choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.println("Convert lbs into kgs.");
            System.out.print("Enter weight in lbs: ");
            weight = sc.nextDouble();
            newweight = weight * 0.453592;
            System.out.println("Weight in kgs: "+newweight+" kgs.");
        }
        else if(choice == 2)
        {
            System.out.println("Convert kgs to lbs.");
            System.out.print("Enter weight in kgs: ");
            weight = sc.nextDouble();
            newweight = weight * 2.20462;
            System.out.println("Weight in lbs: "+newweight+" lbs.");
        }
        else
        {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }    
}