public class Composition
{
    public static void main(String[] args)
    {
        //Composition = represents "part of" relationship between objects
        //An object has another object in it.
        //Allows complex objects to be created from smaller objects

        Car car = new Car("Corvette",2025,"V8 Engine");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine);//this will give the adress to the type in engine
        System.out.println(car.engine.type);//car object has engine object which has the type attribute.

        car.engine.Start();
        System.out.println();
        car.Start();
        //we can either acess method using the engine in car object or create a method in car object that does that for us, and then we access that method!
    }
}
class Car
{
    String model;
    int year;
    Engine engine;

    Car(String model,int year,String engineType)
    {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);//when we pass arguements,the initial parameter name can be different(type in this case), we simply rewrite them(engineType in this case)
    }
    void Start()
    {
        engine.Start();
        //we can add other statements too.
    }
}
class Engine
{
    String type;
    Engine(String type)
    {
        this.type = type;
    }

    void Start()
    {
        System.out.printf("The %s starts!",type);
    }
}