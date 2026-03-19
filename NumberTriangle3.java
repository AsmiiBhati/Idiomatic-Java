import java.util.Scanner;
public class NumberTriangle3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        Triangle(row);
        sc.close();
    }
    public static void Triangle(int row)
    {
        int i,j;
        for(i=row;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j + " ");
                
            }
            System.out.println();
        }
    }
    
}