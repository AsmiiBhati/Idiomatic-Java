public class StaticInMath
{
    public static void main(String[] args)
    {
        /* static = is a keyword.
         * it makes a variable or a method such that it belongs to a class and not any of its objects.
         * it is used to create class variables and methods.
         * class variables are variables that are shared by all instances of a class.
         * class methods are methods that can be called without creating an instance of the class.
         */
        Math.round(8.78);
        Math.sqrt(16.0);
        //here sqrt and round are utility methods, they are static method of the math class
        //we don't need to make objects for them since they are static
    }
}
