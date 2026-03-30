public class Car
{
    //this is made to use in "oop.java" for better understanding
    //attributes (things that an object has, in this case car has the following)
    String maker = "Ford";
    String model = "Mustang";
    int makeyear = 2025;
    double price = 58000.99;
    boolean engineRunning = false;

    void start()
    {
        System.out.println("You start the engine");
    }
    void stop()
    {
        System.out.println("You stop the engine");
    }
    void drive()
    {
        System.out.println("You drive the "+ model);
    }
    void hitBrake()
    {
        System.out.println("You hit the brakes!");
    }

    public static void main(String[] args)
    {
        
    }
}
