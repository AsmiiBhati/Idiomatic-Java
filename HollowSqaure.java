import java.util.*;
public class HollowSqaure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter edge of square:");
        int edge = sc.nextInt();
        square(edge);

        sc.close();
    }
    public static void square(int edge)
    {
        int i,j;
        for(i=0;i<edge;i++)
        {
            for(j=0;j<edge;j++)
            {
                if(i==0 || j==0 || i==edge-1 || j==edge-1)
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
