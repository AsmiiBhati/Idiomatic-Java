import java.util.Scanner;
public class NumberTriangle6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter row: ");
       int row = sc.nextInt();
       Triangle(row);
       sc.close();
    }
    public static void Triangle(int row){
        int i,j;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=2*(row-i);j++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j + " ");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
