import java.util.ArrayList;
import java.util.Collections;

public class Arraylistcode
{
    public static void main(String[] args)
    {
        //ArrayList = resizable array that stores objects (or primitives using autoboxing)
        //Array are in fixed size, but arraylist are dynamic(can change)

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);//add is a built in method of ArrayList
        list.add(2);
        list.add(1);
        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Papaya");
        System.out.println(fruits);

        fruits.remove(1);//remove is a built in method used to remove an element at an index
        System.out.println(fruits);

        fruits.set(0,"Watermelon");//set is a inbuilt method used to set a new value at an index
        System.out.println(fruits);

        System.out.println(fruits.get(2));//get is a inbuilt method used to return a value at given index

        System.out.println(fruits.size());//method toget size of whole array list

        //Sort ArrayList
        Collections.sort(fruits);
        System.out.println(fruits);

        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}
