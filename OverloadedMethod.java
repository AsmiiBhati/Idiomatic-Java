public class OverloadedMethod
{
    //overloaded method = same name, different parameters.
    //method signature = name + parameters, signatures can't be same, name can be.
    public static void main(String[] args)
    {
        System.out.println(add(3,7,1));
    }
    static double add(double a,double b)
    {
        return a+b;
    }
    static double add(double a,double b, double c)
    {
        return a+b+c;
    }
    //we can have same name different parameters but can't have same name and same parameters
    //signature has to be unique.
}
