import java.util.Scanner;
public class PatternOne 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of edges: ");
        int edge = sc.nextInt();
        for(int i = 1;i<=edge;i++)
        {
            for(int j = 1;j<=edge;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }    
}
