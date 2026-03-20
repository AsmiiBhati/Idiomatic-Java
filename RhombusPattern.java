import java.util.Scanner;
public class RhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        Pattern(row);
        sc.close();
    }
    public static void Pattern(int row)
    {
        int i,j;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=row;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
