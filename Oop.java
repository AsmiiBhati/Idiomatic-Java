import java.util.Scanner;

public class Oop
{
    public static void main(String[] args)
    {
    //object = a real word entity that holds data(attributes)
    //         and can perform actions(methods) on it
    //objects are reference data type, stored in a heap
    //class = blueprint used to create an object
    
    Scanner sc = new Scanner(System.in); //sc is an object(even Scanner is, we just named it sc)
    sc.close();
    //Random is an object too
    
    Car Car = new Car();
    Car.engineRunning = true;
    System.out.println(Car);//since object are reference data type, we'll get a memory address.
    System.out.println(Car.maker+"\n"+Car.model+"\n"+Car.makeyear);//dot operator allows to access things within an object
    System.out.println(Car.engineRunning);
    
    Car.start();
    Car.engineRunning = false;
    System.out.println(Car.engineRunning);
    Car.stop();
    Car.drive();
    Car.hitBrake();

    }
}
