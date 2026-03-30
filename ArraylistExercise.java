import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistExercise
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of desired items: ");
        int total = sc.nextInt();
        sc.nextLine();

        int i=1;
        ArrayList<String> items = new ArrayList<>();
        while(i<=total)
        {
            System.out.print("Enter item "+i+": ");
            String item = sc.nextLine().toLowerCase();
            items.add(item);
            i++;
        }
        System.out.println("Your items:");
        System.out.println(items);

        System.out.println("Sorted arraylist(items in order):");
        Collections.sort(items);
        System.out.println(items);
        

        sc.close();
    }
}
