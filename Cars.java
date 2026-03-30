public class Cars
{
//this is made to use in "arrayofobjects.java" for better understanding
    String model;
    String color;

    Cars(String carmodel,String carcolor)
    {
        this.model = carmodel;
        this.color = carcolor;
    }

    void drive()
    {
        System.out.println("You are driving "+ this.color+ " "+ this.model+".");
        //works just as well if we don't use this.color and just color
        //this.color means color of this particular object's model
    }
    
}
