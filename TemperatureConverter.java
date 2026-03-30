import java.util.Scanner;
public class TemperatureConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!\nThis is a Temperature Converter.");
        System.out.println("1. Fahrenheit to Celsius.\n2. Celsius to Fahrenheit.");
        System.out.print("Enter choice(1 or 2): ");
        int choice = sc.nextInt();
        while(choice != 1 || choice !=2)
        {
            System.out.println("Pick a valid option!");
            System.out.print("Enter choice(1 or 2): ");
            choice = sc.nextInt();     
        }
        String convert = (choice == 1) ? "Fahrenheit to Celsius." : "Celsius to Fahrenheit.";
        System.out.println(convert);
        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        double result = (choice == 1) ? (temp-32)*(5/9) : (temp*(9/5)+32);
        String output = (choice == 1) ? "Temperature is %f C" : "Temperature is %f F";
        System.out.printf(output,result);

        sc.close();
    }  
}
