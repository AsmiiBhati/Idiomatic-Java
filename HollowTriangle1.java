import java.util.*;
public class HollowTriangle1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        pattern(row);
        sc.close();
    }
    public static void pattern(int row)
    {
        int i,j;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=i;j++)
            {
                
                if(j==1 || j==i || i==row)
                {
                    System.out.print("*");
                }
                
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
