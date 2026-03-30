import java.util.Scanner;
public class TernaryOperator
{
    public static void main(String[] args)
    {
        //ternary operator(?) = return either value based on condition.
        //it is like a single line if else statement.

        //variable = (condition) ? ifTrue() : ifFalse();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        String result = (score>=33) ? "You've passed!" : "You've failed!";
        String result1 = (score>=65) ? "You've got distinction!" : "";
        System.out.println(result);
        System.out.println(result1);

        sc.close();
    }
}
