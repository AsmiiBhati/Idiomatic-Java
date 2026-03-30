public class Varargs 
{
    public static void main(String[] args)
    {
        //varargs = variable arguements
        //varargs allow a method to be flexible and hold varying number of arguements.
        //java will pack the arguements in an array
        // ... is ellipsis
        add(1,2,3,4,5);
    }
    static int add(int...numbers) //array name = numbers, type = int, ... = ellipsis
    {
        int sum = 0;
        System.out.println(numbers);
        for(int number : numbers)
        {
            System.out.print(number + " ");
        }
        System.out.println();
        for(int number : numbers)
        {
            sum += number;
        }
            
        System.out.println("Sum is: " + sum);
        return 0;
    }
}
