import java.util.Scanner;
public class NumberTriangle4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int num = sc.nextInt();
      Triangle(num);
      sc.close();
    }
    public static void Triangle(int num)
    {
        int i,j;
        int n = 1;
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
