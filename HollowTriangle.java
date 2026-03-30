import java.util.*;
public class HollowTriangle
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
                if(j==1 || j==i)
                {
                    if(i==row)
                {
                    for(int k =1;k<=row;k++)
                    {
                        System.out.print("*");
                    }
                    break;
                }
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
