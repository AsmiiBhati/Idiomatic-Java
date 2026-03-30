
import java.util.Scanner;
public class RuntimePolymorphism
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Runtime/Dynamic Polymorphism = Method to be executed isdecided at runtime based on the data type of the object.
        Animal animal;//we can't initialise Animal since its from an abstract class.

        System.out.print("do you want a cat or dog?(1=Dog 2=Cat): ");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2)
        {
            animal = new Cat();
            animal.speak();
        }
        else
        {
            System.out.println("You didn't pick a valid input!");
        }

        sc.close();
    }
}
abstract class Animal
{
    abstract void speak();
}
class Dog extends Animal
{
    @Override
    void speak()
    {
        System.out.println("Dog says Woof!");
    }
}
class Cat extends Animal
{
    @Override
    void speak()
    {
        System.out.println("Cat says Meow!");
    }
}