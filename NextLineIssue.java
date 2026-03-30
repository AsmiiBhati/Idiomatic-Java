import java.util.Scanner;
public class NextLineIssue 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age:");
        int age = sc.nextInt();
        sc.nextLine(); 
        /*when we press enter after inputing age,by default it takes input as age\n.
          the nextLine() inputs(reads) this \n as the input to enter in the color thing.
          so to avoid this we write sc.nextLine(); after that which kind of consumes the "\n"
          this thing happens when we first take an integer/double and then a string.
        */

        System.out.print("Enter color:");
        String color = sc.nextLine();

        System.out.println("Your age is "+ age);
        System.out.println("Your fav color is "+ color);
        sc.close();
    }
}