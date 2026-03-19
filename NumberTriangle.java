import java.util.*;
public class NumberTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int total = sc.nextInt();

        Triangle(total);
        sc.close();
    }
    public static void Triangle(int total)
    {
        int i,j;
        for(i=1;i<=total;i++)
        {
            for(j=1;j<=total-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
