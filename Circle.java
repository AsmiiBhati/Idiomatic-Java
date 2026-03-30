import java.util.Scanner;
public class Circle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double rad = sc.nextDouble();

        double cir,area,vol;
        cir = 2 * Math.PI * rad;
        area = Math.PI * Math.pow(rad,2);
        vol = 4 * (Math.PI * Math.pow(rad,3)) / 3;
        System.out.println("Circumference: "+cir+" cm");
        System.out.println("Area: "+area+ " cm^2");
        System.out.println("Volume: "+vol+ " cm^3");
        //printf is used in java to put placeholder. works similar to that of C
        //.2 below shows how many digits after the decimal
        System.out.printf("Circumference: %.2f cm\n",cir);
        System.out.printf("Area: %.2f cm^2\n",area);
        System.out.printf("Volume: %.2f cm^3\n",vol);
        sc.close();
    }
}
