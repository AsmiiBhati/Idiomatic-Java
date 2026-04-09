import java.util.Scanner;

public class SearchArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int[] digits = {1,2,8,5,9,4};
        //int element = 8;
        int[] digits;
        int element = 0;
        boolean isfound = false;
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        digits = new int[size];
        for(int i =0;i<size;i++)
        {
            System.out.print("Enter element:");
            digits[i] = sc.nextInt();
        }
        for(int i=0;i<digits.length;i++)
        {
            System.out.println(digits[i]);
        }
        System.out.print("Enter element to be found:");
        element = sc.nextInt();

        for(int i=0;i<digits.length;i++)
        {
            if(element == digits[i])
            {
                System.out.println("Element found at index: " + i);
                isfound = true;
                break;
            }
        }
        if(!isfound)
        {
            System.out.println("Element not found in array");
        }
        sc.close();
    }    
}
