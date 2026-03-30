//import java.util.ArrayList;

public class ArrayListConcept
{
    public static void main(String[] args)
    {
        //when building a dynamic array we can just use the built in ArrayList, but for the sake of learning we'll create our own dynamic array here.

        //ArrayList<String> arrayList = new ArrayList<String>();

        DynamicArray dynArr = new DynamicArray(5);//changed the capacity to 5. default:10
        //System.out.println(dynArr.capacity);

        //DynamicArray dynArr = new DynamicArray();

        dynArr.add("A");
        dynArr.add("B");
        dynArr.add("C");

        dynArr.insert(1,"E");
        System.out.println(dynArr.toString());//we can remove the ".toString()" and it'll still work the same way.
        //System.out.println(dynArr); just to show that it'll work fine without the toString() too.

        System.out.println("Empty: " + dynArr.isEmpty());//will show true if array is empty, false when it contains elements
        System.out.println("Size: " + dynArr.size);
        System.out.println("Capacity: " + dynArr.capacity);
        dynArr.delete("A");
        System.out.println(dynArr);
        System.out.println(dynArr.search("J"));
        System.out.println(dynArr.search("B"));

        dynArr.add("F");
        dynArr.add("G");
        System.out.println(dynArr);//at this point(capacity=5) the array is full
        System.out.println("Empty: " + dynArr.isEmpty());
        System.out.println("Size: " + dynArr.size);
        System.out.println("Capacity: " + dynArr.capacity);
        //Further adding elements will automatically invole grow() and we'll have more capacity.
        dynArr.add("H");
        System.out.println(dynArr);
        System.out.println("Empty: " + dynArr.isEmpty());
        System.out.println("Size: " + dynArr.size);
        System.out.println("Capacity: " + dynArr.capacity);
        dynArr.delete("C");
        dynArr.delete("E");
        dynArr.delete("G");//this point is where the size will shrink
        //dynArr.delete("H");
        System.out.println(dynArr);//at this point(capacity=5) the array is full
        System.out.println("Empty: " + dynArr.isEmpty());
        System.out.println("Size: " + dynArr.size);
        System.out.println("Capacity: " + dynArr.capacity);


    }
}
class DynamicArray
{
    int size;
    int capacity = 10;
    Object[] array;//array of Object named array

    public DynamicArray()//constructor
    {
        this.array = new Object[capacity];// instantiated new fixed size array
    }
    public DynamicArray(int capacity)//overloaded constructor if the user wants to set the capacity
    {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    
    public void add(Object data)//method to add data at next free index(the size index actually)(insert at last index)
    {
        if(size>=capacity)
        {
            grow();
        }
        array[size] = data;//size means number of elements currently stored in array. the data goes to current 'size' index.(new element is placed at the next free index)
        size++;//cuz we just added data, so size will increase by one space too.
    }
    public void insert(int index, Object data)//method to inster at any index
    {
        if(size >=capacity)
        {
            grow();
        }
        for(int i = size;i>index;i--)//i = size for the next free index, i>index cuz we only need to shift the elements from index till end of array towards right. i-- cuz we don't wanna overwrite the location, i-- ensures we first copy the element on its right index.
        {
            array[i] = array[i-1];//why i-1? cuz we want to assign the value of the previous index to the i index so that we shift every element to right, and make room for the new element.example: array[3] = array[3-1]; means that vaue at array[2] is now copied at array[3], we cap just shift everything towards right in this manner.
        }
        array[index] = data;
        size++;
    }
    public void delete(Object data)//method
    {
        for(int i = 0;i<size;i++)
        {
            if(array[i] == data)
            {
                for(int j = 0;j<(size-i-1);j++)
                {
                    array[i+j] = array[i+j+1];
                }
                array[size-1] = null;
                size--;
                if(size<=(int) (capacity/3)) //casting the divison as an (int), cuz their is a chance it might not divide wholely (like 5/3 is 1.6 but (int) will help consider it has 1.)
                //we first perform division then cast it as an integer. another way is (int)capacity/3 which means that we'll first make the capacity an integer an dthen perform an integral divison.
                {
                    shrink();
                }
                break;
            }
        }
    }
    public String search(Object data)//method
    {
        for(int i =0;i<size;i++)
        {
            if(array[i] == data)
            {
                
                return "Element " + data +" found at index: " + i;
            }
        }
        return "Element " + data + " not found!";
    }
    private void grow()//increase size of array
    {
        int incCapacity = (int)(capacity*2);
        Object[] newArray = new Object[incCapacity];//new array with increased capacity

        //copying elments in the new array
        for(int i = 0;i<size;i++)
        {
            newArray[i] = array[i]; 
        }
        capacity = incCapacity;
        array = newArray;
    }
    private void shrink()//used to shrink the array if soze is too less and the capacity is getting wasted
    {
        int incCapacity = (int)(capacity/2);
        Object[] newArray = new Object[incCapacity];//new array with increased capacity

        //copying elments in the new array
        for(int i = 0;i<size;i++)
        {
            newArray[i] = array[i]; 
        }
        capacity = incCapacity;
        array = newArray;
    }
    public boolean isEmpty()//will return true only if size is 0
    {
        return size == 0;
    }
    public String toString()//display the lements of array
    {
        String string = "";
        for(int i=0;i<capacity;i++)//i<size will give only the added elements but if you wanna see the whole array, put i<capacity. the unfilled space will show "null". eg if we have given only three input A B and C . i<size will help display [A,B,C] and i<capacity will help display [A,B,C,null,null,null,null,null,null,null] (assuming default capacity of 10)
        {
            string += array[i] + ",";
        }
        //when we printed using just the above code we printed "A,B,C," to remove this end comma and make it more clean we'll do the following
        if(string != "")
        {
            string = "[" + string.substring(0,string.length()-1) + "]";//the "-1" will remove the last character(comma) which we don't want
        }
        else
        {
            string = "[]";
        }
        return string;
    }
}