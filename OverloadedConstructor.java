public class OverloadedConstructor
{
   /*Overloaded constructors allow a class to have multiple constructors
   with different parameter lists. This enables flexible object creation. */
    public static void main(String[] args)
    {
    // Constructor name is the same, but the number/types of parameters decide which one is called.
    User user0 = new User();
    User user1 = new User("Alice");//since we have given default values in user class, we don't have to mention those attributes here.
    User user2 = new User("Bob","bob.bob@gmail.com");
    User user3 = new User("Chalsey","c.halsey@gmail.com",21);

    System.out.println(user0.username+" "+user0.useremail+ " "+ user0.age);
    System.out.println(user1.username+" "+user1.useremail+ " "+ user1.age);
    System.out.println(user2.username+" "+user2.useremail+ " "+ user2.age);
    System.out.println(user3.username+" "+user3.useremail+ " "+ user3.age);
    }   
}
