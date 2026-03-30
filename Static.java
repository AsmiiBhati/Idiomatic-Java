public class Static
{//in this static is used with class variables and class methods
    public static void main(String[] args)
    {
        /* static = is a keyword.
         * it makes a variable or a method such that it belongs to a class and not any of its objects.
         * it is used to create class variables and methods.
         * class variables are variables that are shared by all instances of a class.
         * class methods are methods that can be called without creating an instance of the class.
         */
        Friend friend1 = new Friend("Alice");
        Friend friend2 = new Friend("Barney");
        Friend friend3 = new Friend("Charles");
        Friend friend4 = new Friend("Daniel");

        //number of friends of friend1(before using static this will show as 1)
        System.out.println(friend1.numOfFriends);
        //number of friends of friend2(before using static this will also show as 1)
        System.out.println(friend2.numOfFriends);
        //number of friends of friend3(before using static this will also show as 1)
        System.out.println(friend3.numOfFriends);
        //number of friends of friend4(before using static this will also show as 1)
        System.out.println(friend4.numOfFriends);

        //total friends
        System.out.println(Friend.numOfFriends);
        /*Accessing static fields via the class name is preferred for clarity, as it shows the field belongs to the class, not to any specific instance. You can also use friend1.numOfFriends or friend2.numOfFriends in System.out.println,
        and they will both output 2, since numOfFriends is static and shared by all instances.
        However, it is better practice to access static variables using the class name (Friend.numOfFriends)
        instead of through individual objects, unless specifically required. */
        
        Friend.showFriends();
    } 
}
class Friend
{
    //this is made to use in "Static.java" for better understanding.
    String name;
    static int numOfFriends;
    Friend(String fname)
    {
        this.name = fname;
        numOfFriends++;
        System.out.println("");
    }

    static void showFriends()
    {
        System.out.println("You have "+numOfFriends+ " friends in total.");
        // In static methods, we don't use "this" because they belong to the class, not any specific object.
        // "this" refers to the current object, but static methods run without creating an object.
        // Since static methods are shared across all objects, there's no specific object to refer to.

    }
}