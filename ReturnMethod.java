public class ReturnMethod
{
    public static void main(String[] args)
    {
        //double result = square(3.0);
        //System.out.println(result);
        System.out.println(square(3.0)); //both will give same result

        //String fullName = getfullName("Spongebob","Squarepants");
        //System.out.println(fullName);
        System.out.println(getfullName("Spongebob","Squarepants")); //both will give same result

        System.out.println(ageCheck(21));
    }
    static double square(double number)
    /*we use static as we are calling this method from another method(the main method)
    which is static*/
        {
            return number * number;
        }
    static String getfullName(String first,String last)
    {
        return first + " " + last;
    }
    static boolean ageCheck(int age) //will return true or false
    {
        return age>=18; //this one thing will act as whole if-else statement for above or below 18.
    }
}
