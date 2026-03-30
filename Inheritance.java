public class Inheritance
{
    public static void main(String[] args)
    {
        //Inheritance = one class derives/inherits the attributes of another class.Parent --> Child
        //Single Level = Parent --> Child
        //Multi Level = GrandParent --> Parent --> Child

        Dog dog1 = new Dog();
        Cat cat1  = new Cat();

        //below two will output true even though they are empty class(as of now), this shows that they do inherit everything from Animal class
        System.out.println(dog1.isAlive);
        System.out.println(cat1.isAlive);

        //below two will work too(we did not write anything inside the class cat and dog during this,they were empty)
        cat1.eat();
        dog1.eat();
        //now can given them their own attributes and methods
        dog1.sound();
        System.out.println("Our dog has " + dog1.lives + " lives.");
        cat1.sound();
        System.out.println("Our cat has " + cat1.lives + " lives.");

        Puppy puppy1 = new Puppy();

        System.out.println(puppy1.isAlive);
        puppy1.eat();
        puppy1.sound();
        puppy1.plays();

        //cat1.personality(); though cat and dog are siblings they do not share methods.so this will show error. 

    }
}
class Animal
{
    boolean isAlive;

    Animal()
    {
        this.isAlive = true;
    }

    void eat()
    {
        System.out.println("The animal is eating!");
    }
}
class Dog extends Animal //'extends' is used to show inheritance.dog is child.
{
    //we saw that they work even if they are empty, but with attributes that their parent class had.
    //They have their own attributes and methods too.
     String color = "Brown";
    int lives = 1;
    void sound()
    {
        System.out.println("A dog says Bow Bow.");
    }
    void personality()
    {
        System.out.println("A dog is very loyal!");
    }
}
class Cat extends Animal//cat is the child.
{
    //we saw that they work even if they are empty, but with attributes that their parent class had.
    //They can have their own attributes and methods too.
     String color = "White";
    int lives = 9;
    void sound()
    {
        System.out.println("A cat says Meow Meow.");
    } 
}
class Puppy extends Dog//and Dog inherits from Animal
{
    //even empty Puppy will inherit attributes and methods of Dog and Animal.
    //it can have its own unique attributes and methods too.
    int age = 2;
    void plays()
    {
        System.out.println("The puppy plays!");
    }
}
