public class Polymorphism 
{
    public static void main(String[] args)
    {
        //Polymorphism = new form/shape
        //Objects can identify as other objects
        //Objects can be treated as objects of a common superclass.
        //Polymorphism can also be achieved using interfaces.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        Vehicle[] vehicles = {car,bike,boat};
        for(Vehicle vehicle: vehicles)
        {
            vehicle.go();
        }
    }
}
abstract class Vehicle
{
    abstract void go();
}
class Car extends Vehicle
{
    @Override
    void go()
    {
        System.out.println("You drive the Car!");
    }
}
class Bike extends Vehicle
{
    @Override
    void go()
    {
        System.out.println("You ride the Bike!");
    }
}
class Boat extends Vehicle 
{
    @Override
    void go()
    {
        System.out.println("You sail the Boat!");
    }
}