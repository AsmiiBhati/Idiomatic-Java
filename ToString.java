public class ToString
{
    public static void main(String[] args)
    {
        //.toString() = its a method inherited from object class
        //whenever we create an object, behind the scenes the object is actually a super class
        //.toString() method is used to return a string representation of object, default behaviour of this method is to return a hashcode as a unique identifier of that object.
        //can be overridden

        Car car = new Car("Ford","Mustang","Black",1998);

        // System.out.println(car) implicitly calls car.toString() because we have overridden the toString() method in the Car class.
        System.out.println(car);
        

    }
}
class Car
{
    String model;
    String maker;
    String color;
    int year;

    Car(String model,String maker,String color,int year)
    {
        this.model = model;
        this.maker = maker;
        this.color = color;
        this.year = year;
    }
    @Override
    public String toString()
    {
        return model + " "+ maker+ " " +year + " " + color;
    }
}    