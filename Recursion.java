public class Recursion
{
    public static void main(String[] args)
    {
        //recursion = when a function calls itself until specific conditions are met.
        
        //num(); //calling this function will give an infinite recursion since the function calls itself without any condition. At some point, stack overflow will occur.
        
        int count = 1;
        number(count);

    }
    /*static void num()
    {
        System.out.println("hello");
        num();
    }*/
    static void number(int count)//shows finite recursion
    {
        if(count > 3)
            {
                System.out.println("Done!");
                return;
            }
        System.out.println(count);
        count++;
        number(count);
    }
}
