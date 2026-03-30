import java.util.Scanner;

public class PatternSix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of lines: ");
        int line = sc.nextInt();
        for(int i=line;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
