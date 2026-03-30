import java.util.Scanner;

public class GCD
{
    public static void main(String[] args) {
        // code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        while(a != 0)
        {
            int remainder = b%a;//we don't need min(a,b) since % handles it
            b = a;
            a = remainder;
        }
        System.out.println(b);
        sc.close();
    }
}  

