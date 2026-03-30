import java.util.Scanner;

public class PatternThree
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Number of lines: ");
       int line = sc.nextInt();
       //int i = 1;
       for(int i =1;i<=line;i++)
       {
            for(int j = 1;j<=i;j++)
            {
               System.out.print(j); 
            }
            System.out.println();
       }
      /*while(i<=line)
      {
        System.out.print(i);
        i++;
      }*/
       sc.close();
    }
}
