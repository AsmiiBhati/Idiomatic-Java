import java.util.Scanner;

public class PrintNameNTimes
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Number of repetitions: ");
        int num = sc.nextInt();
        int count = 1;
        names(count,name,num);
        sc.close();
    }
    static void names(int count,String name,int num)
    {
        if(count>num)
        {
            return;
        }
        System.out.println(name);
        count++;
        names(count,name,num);
    } 
}
