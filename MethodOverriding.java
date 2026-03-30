public class MethodOverriding //we used showed this in super too, this is just another example
{
    public static void main(String[] args)
    {
        //Method Overriding = when a subclass provides its own omplementation to a previoudly defined method, used for code reusability
        Animal animal = new Animal(true);
        animal.sound();
        Fish fish = new Fish(true,"Orange");
        fish.sound();
        Dog dog = new Dog(true,"Brown");
        dog.sound();
        Cat cat = new Cat(true,"White");
        cat.sound();

    }
}

class Animal
{
    boolean isAlive = true;

    Animal(boolean isAlive)
    {
        this.isAlive = isAlive;
    }
    void sound()
    {
        System.out.println("All animal has some sound!");
    }
    void move()
    {
        System.out.println("Animal can run!");
    }
}
class Fish extends Animal
{
    String color;

    Fish(boolean isAlive,String color)
    {
        super(isAlive);
        this.color = color;
    }
    @Override//this is written to show that the below method is overridden.
    void sound()
    {
        System.out.println(color+" fish goes bloop!");
    }
    @Override//this is written to show that the below method is overridden.
    void move()//since parent move() said run but since fish swim, we will override this very method to say fish will swim
    {
        System.out.println("Animal can swim!");
    }
}
class Dog extends Animal
{
    String color;

    Dog(boolean isAlive,String color)
    {
        super(isAlive);
        this.color = color;
    }
    @Override//this is written to show that the below method is overridden.
    void sound()
    {
        System.out.println(color+ " dog goes woof!");
    }
}
class Cat extends Animal
{
    String color;
    Cat(boolean isAlive,String color)
    {
        super(isAlive);
        this.color = color;
    }
    @Override//this is written to show that the below method is overridden.
    void sound()
    {
        System.out.println(color+" cat goes meow!");
    }
}