import java.util.Arrays;

public class array 
{
    //array = collection of values of same data type
    //(kind of a variable that can hold more than 1 values)
    public static void main(String[] args)
    {
        String fruit1 = "Apple"; //This is a string
        System.out.println(fruit1);

        String[] fruits = {"Apple","Banana","Pineapple","Mango","Avacado"};
        System.out.println(fruits);
        /* when we excute the above two statements, we get a memory address,
           since array is reference datatypes it refers to its location*/
        // so to access them we use indexing(starts with zero)
        System.out.println(fruits[0]);
        //we can change values in array
        fruits[0] = "Watermelon";
        System.out.println(fruits[0]);
        //length of array
        //int totalFruits = fruits.length;
        //System.out.println(totalFruits);
        System.out.println(fruits.length); //both will give same output
        Arrays.sort(fruits);//again,gives address
        System.out.println(fruits + " ");
        for(int i=0;i<fruits.length;i++) //to get all elements of array
        {
            System.out.print(fruits[i]+" ");
        }
        System.out.println();
        //fill array with certain element
        Arrays.fill(fruits,"Grapes");
        //enhanced for loop(also called for each loop)
        //simplifies iterating through an array
        for(String fruit : fruits)
        {
            System.out.print(fruit + " ");
        }
    }    
}
