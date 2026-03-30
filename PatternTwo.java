import java.util.Scanner;

public class PatternTwo 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Lines: ");
        int line = sc.nextInt();
        for(int i =1;i<=line;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
