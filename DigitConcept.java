import java.util.Scanner;

public class DigitConcept //has both digit concpet and count digits
{
    public static void main(String[] args)
    {
        //say we have w = 7789
        //if we want to extract each digit seperately, we'll use % 10 (modulus operator).
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();
        int count = 0;
        System.out.println("Digits: ");
        while(num>0)
        {
            int digit = num%10;
            count++;
            num = num/10;
            System.out.print(digit + " ");
        }
        System.out.println("\nNumber of Digits: "+count);
        sc.close();
    }
}
//when the number of iterations depend on divisions, the time complexity is also logarithmic. 
//in this case, O(log10(n))