import java.util.Scanner;

public class InputInArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //String[] foods = new String[3];
        String[] foods;
        int size;
        System.out.print("Enter length of array: ");
        size = sc.nextInt();
        sc.nextLine();
        
        foods = new String[size];
        System.out.println("Size: "+foods.length);
        for(int i=0;i<foods.length;i++)
        {
            System.out.print("Enter food: ");
            foods[i] = sc.nextLine();
        }
        System.out.println("Your foods are:");
        for(int i=0;i<foods.length;i++)
        {
            System.out.println(foods[i]);
        }
        sc.close();
    }    
}
