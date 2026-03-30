import java.util.Scanner;
public class AreaOfRectangle 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length:");
        float length = sc.nextFloat();
        System.out.print("Enter breadth:");
        float breadth = sc.nextFloat();

        float area;
        area = length*breadth;
        System.out.println("Area of rectangle is: "+area+ " cm²"); //superscript 2 by pressing numlockon+alt+0178
        
        sc.close();
    }
}