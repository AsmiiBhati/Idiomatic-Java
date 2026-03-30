public class VariableScope
{
    //variable scope is where a variable can be accessed
    //it has two types - local and class

    //class variable is defines in a class, not in a method
    static int y = 21;
    //JAVA likes to use local variables first, so it is rewritten on
    public static void main(String[] args)
    {
        //when declared inside a method, it has local scope
        //local variable is unfaimiliar outside the main method brackets unless we pass arguments
        int x =1;
        int y = 4;
        System.out.println(y);
        System.out.println(x);
        //int x = 2; // error since x is used twice
        something(); //will print 2 since something() is unaware of x=1
    }    
    static void something()
    {
        int x = 2; //it won't give error if x is used twice
        System.out.println(x);
        System.out.println(y);
    }
}
