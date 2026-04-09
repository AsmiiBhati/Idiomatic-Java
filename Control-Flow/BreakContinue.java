public class BreakContinue
{
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        //break -> STOPS the loop
        //continue -> SKIPS that iteration
        {
            if(i==5)
            {
                //break;
                System.out.println("we're skipping 5.");
                continue;
            }
            System.out.print(i+ "\t");
        }
    }
}
