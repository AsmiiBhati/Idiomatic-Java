import java.util.Scanner;
public class WhileLoop
{
    public static void main(String[] args)
    {
        // while loop repeat the code as long as the condition stays true.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the power you want for first 5 natural numbers: ");
        double pow = sc.nextDouble();
        int i = 1;
        while(i<=5)
        {
            System.out.println(Math.pow(i,pow));
            i++; //I forgot this and just created an infinte loop
        }
        sc.close();
    }    
}

