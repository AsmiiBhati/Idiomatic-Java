import java.util.Scanner;

public class PatternSeven 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of lines: ");
        int line = sc.nextInt();
        for(int i = 1;i<=line;i++)
        {//say line = 5
            for(int l=1;l<=line-i;l++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            for(int r=1;r<=line-i;r++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
