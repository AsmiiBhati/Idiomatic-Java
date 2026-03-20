import java.util.Scanner;
public class NumberTriangle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int num = sc.nextInt();
        Triangle(num);
        sc.close();
    }
    public static void Triangle(int num)
    {
        int i,j;
        
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }  
}
