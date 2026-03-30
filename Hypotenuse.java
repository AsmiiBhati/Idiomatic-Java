import java.util.Scanner;
public class Hypotenuse // h = Math.sqrt(p^2 + b^2)
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double perp, base, hypo;
        System.out.print("Enter perpendicular: ");
        perp = sc.nextDouble();
        System.out.print("Enter base: ");
        base = sc.nextDouble();

        hypo = Math.sqrt(Math.pow(perp,2) + Math.pow(base,2));
        System.out.println("Hypotenuse is: "+hypo);
        sc.close();
    }
}
