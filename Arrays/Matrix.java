import java.util.Scanner;
public class Matrix 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row,col;
        char sym;

        System.out.print("Enter number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        col = sc.nextInt();
        System.out.print("Enter the symbol for the matrix: ");
        sym = sc.next().charAt(0);

        //its our choice to initialize either row or column first.
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print(sym + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
