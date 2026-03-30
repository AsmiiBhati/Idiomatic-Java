import java.util.Scanner;
public class PizzaOrder 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double pizzaprice = 100;
        int quantity;
        double cost;

        System.out.print("Number of Pizza(s): ");
        quantity = sc.nextInt();
        System.out.println("Cost per pizza: Rs. 100");
          if(quantity>2)
        {
            cost = pizzaprice * quantity;
        }
        else
        {
            cost = pizzaprice * quantity + 15*quantity;
            System.out.println("Small Bag Charge: Rs. 15 per pizza.");
        }
        System.out.println("Total amount to be paid:Rs. "+cost);
        
        sc.close();
    }
}