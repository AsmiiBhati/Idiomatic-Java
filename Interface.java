public class Interface
{
    public static void main(String[] args)
    {
        //interface = blueprint of a class that has many abstract methods,these methods should be in all implementing classes.
        //interfacing allows multiple inheritance.
        //interfacing allows more than one implementations, inheriteance does not
        Rabbit rabbit = new Rabbit();
        rabbit.run();
        Fish fish = new Fish();
        fish.run();
        Hawk hawk = new Hawk();
        hawk.hunt();
    }
}
interface Prey
{
    void run();//if any class implements(inherit basically) prey, it must use this method.
}
interface Predator
{
    void hunt();//if any class implements(inherit basically) predator, it must use this method.
}
class Rabbit implements Prey
{
    @Override
    public void run()
    {
        System.out.println("The rabbit is running away from the hawk!");
    }
}
class Fish implements Prey,Predator//fish can implement both prey and predator interfaces, this is one difference between interfacing and inheritance
{
    @Override
    public void run()
    {
        System.out.println("The fish is swimming away from the hawk!");
    }
    @Override
    public void hunt()
    {
        System.out.println("The fish is hunting smaller fish!");
    }
}
class Hawk implements Predator
{
    @Override
    public void hunt()
    {
        System.out.println("The hawk is hunting rabbit and fish!");
    }
}