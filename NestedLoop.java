public class NestedLoop
{
    public static void main(String[] args)
    {
        // nested loop : loop within a loop
        //often used in matrices and DSA
        /* take an example, we wanna print 1-9 three times, instead of using for loop three times
           we can just use loop within a loop stating we need to print 1-9 thrice.
        */
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<10;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
