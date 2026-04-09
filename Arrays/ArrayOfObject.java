public class ArrayOfObject
{
    //this args is the name of the string, you can change it.
    public static void main(String[] args)
    {
        Cars carone = new Cars("Mustang","Red");
        Cars cartwo = new Cars("Mini Cooper","Blue");
        Cars carthree = new Cars("Mercedes","White");
        
        /*carone.drive();
        cartwo.drive();
        carthree.drive();*/

        Cars[] cars = {carone,cartwo,carthree};
        //Cars[] cars = {new cars("Mustang","Red"),new cars("Mini Cooper","Blue"),new cars("Mercedes","White")};
        //both above statement will give same results, we can use secon statement
        //when we don't wish to initialise each new object with a unique identifier
        //the objects made inside this array would be termed as anonymous objects
        for(int i=0;i<cars.length;i++)
        {
            cars[i].drive();
        }
        System.out.println();
        /* Each object in the array is of type `cars`, 
        so the loop variable `car` must also be of type `cars`.*/
        //first cars is the class
        //car is the temp variable for looping
        //second cars is our array of cars
        for(Cars car: cars)
        {
            car.drive();
        }

        //change all cars' color to purple
        for(Cars car:cars)
        {
            car.color = "purple";
        }
        System.out.println();
        for(Cars car: cars)
        {
            car.drive();
        }
    }
}
