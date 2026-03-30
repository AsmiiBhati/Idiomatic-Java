import java.util.Scanner;
public class AvgVarargs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //take user input for total elements
        int total = 0;
        System.out.print("Enter total number of elements: ");
        total = sc.nextInt();
        int[] num = new int[total];
        //create loop for taking that many inputs in an array
        for(int i = 0;i<total;i++)
        {
            System.out.print("Enter number: ");
            num[i] = sc.nextInt();
        }
        System.out.println("Entered values: ");
        for(int n :num)
        {
            System.out.print(n +" ");
        }
        System.out.println();
        //call method
        int avg = average(num);
        System.out.println("Average: "+ avg);

        sc.close();
    }
    static int average(int...numbers)
    {
        int sum = 0;
        for(int number : numbers)
            {
                sum += number;
            }
        return sum/numbers.length;
        
    }
}
