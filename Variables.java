public class Variables
{
    public static void main(String[] args)
    {
        /* variables are containers, once they hold values they behave as those values.
           two types - primitive : simple value stored directly in  memory(stack). int,double,char,boolean
                       reference : memory address stored in stack that points to heap. string,array,object
            primitive is like giving you 10rs, reference is like giving you a check of 10rs.*/
        int age1; //declaration, no initialization.
        age1 = 21; //assignment, initilazation.
        int age2 = 20; //declaration and assignment, initialization.
        System.out.println("age1 is " + age1);
        System.out.println("age2 is " + age2);
        
        double weight = 64.2;
        System.out.println("weight is " + weight + " kg.");
        
        char gender = 'F'; //can print symbols too like $%! etc.
        System.out.println("gender is " + gender);

        boolean isStudent = true;
        System.out.println(isStudent);
        //boolean isn't used directly much, its used in statements more.
        //by default, if() with boolean is considered true and else is considered false.
        //if(isStudent == true)
        if(isStudent)
        {
            System.out.println("I am a student.");
        }
        else
        {
            System.out.println("I am not a student.");
        }
        String name = "alice";
        System.out.println(name);

        System.out.println("Details:" + age1 + " " + weight + " " + gender);
    }
}