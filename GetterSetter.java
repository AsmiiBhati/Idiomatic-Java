public class GetterSetter
{
    public static void main(String[] args)
    {
        //Help protect object data and add rules to modify data
        //GETTER = method that makes the field readable
        //SETTER = method that makes the field writeable

        Car car = new Car("Tiago","White",1200000);

        //car.color = "Blue";//the attributes of the Car class are easily changeable since they are public.

        //what we can do to make them non changeable, we can add private access modifier, but we con't be able to access them now.
        //to fix this we use get and set methods

        System.out.println(car.getColor() + " " + car.getModel()+ " " + car.getPrice());
        //th get methods are accessible this way.
        car.setColor("Blue");
        car.setPrice(200000);
        System.out.println(car.getColor() + " " + car.getModel()+ " " + car.getPrice());

    }
}
class Car
{
    private final String model;//final makes this attribute only readable and permanent
    private String color;
    private int price;

    Car(String model,String color,int price)
    {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    String getModel()
    {
        return this.model;
    }
    String getColor()
    {
        return this.color;
    }
    String getPrice()
    {
        return "Rs." + this.price;
    }
    //since i don't want to change my car model we will not make it writtable, so won't use set method for this.
    void setColor(String color)
    {
        this.color = color;
    }
    void setPrice(int price)
    {
        this.price = price;
    }
}