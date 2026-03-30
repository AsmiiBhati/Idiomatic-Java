import java.util.Random; //random changes with each execution, even the coder can't predict the exact.
public class random//we can't name this 'R'andom since it will call the random class now only.
{
    public static void main(String[] args)
    {
        Random random = new Random(); // scanner uses system.in, random does not

        int x = random.nextInt(); // just this will give a huge range. so we put constraints.
        System.out.println("x is: "+x);

        //how to put constraint. random.nextInt(1,6) --> gives values 1 to 5.
        int y = random.nextInt(1,10); // 1 to 9
        System.out.println("y is: "+y);

        double z = random.nextDouble(); // give values from zero to one.
        System.out.println("z is: "+z);
        double v = random.nextDouble(0.5,0.678);
        System.out.println("v is: "+v);

        boolean isHeads = random.nextBoolean(); //random true or false
        if(isHeads)
        {
            System.out.println("It's Heads!");
        } 
        else
        {
            System.out.println("It's Tails!");
        }
    }
}
