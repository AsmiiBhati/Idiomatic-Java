public class Method
{
    //method is a block of code exceuted when called ()
        public static void main(String[] args) //method is written outside this main method
    {
        String name = "alice";
        int age = 25;
        boolean isbirthday = true;
        if(isbirthday)
        {
            hbd(name,age);
        }
    }
    //methods are unfamiliar with varibles declared in other methods
    //to resolve this we use arguments in method like hbd(name)
    static void hbd(String name,int age) //instead of name we can use any word,but use it accordingly below too.
    //this (String name) is a parameter that we pass otherwise it won't be able to use the string.
    {
        for(int i=1;i<=3;i++)
        {
            System.out.printf("Happy birthday to you,%s!\n", name);
        }
        System.out.printf("You're %d years old now!",age);
    }
}
