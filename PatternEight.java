import java.util.Scanner;

public class PatternEight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of lines: ");
        int line = sc.nextInt();
        for(int i =1;i<=line;i++)
        {
            for(int l=1;l<=i-1;l++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=2*line-i;k++)
            {
                System.out.print("*");
            }
            for(int r=1;r<=i-1;r++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
