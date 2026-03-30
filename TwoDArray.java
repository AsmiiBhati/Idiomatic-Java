public class TwoDArray
{
    public static void main(String[] args)
    {
        //2D array = array in which each element is an array.
        //useful for storing a matrix of data.
        //String[] Fruits = {"Apple","Orange","Banana"};
        //String[] Vegetable = {"Potato","Onion","Carrot"};
        //String[] Utensil = {"Spoon","Ladle","Bowl"};
        //String[][] dinner = {Fruits,Vegetable,Utensil};
        String[][] dinner = {{"Apple","Orange","Banana"},
                             {"Potato","Onion","Carrot"},
                             {"Spoon","Ladle","Bowl"}}; 
        for(String[] table : dinner)
        {
            for(String served:table)
            {
                System.out.print(served+" ");
            }
            System.out.println();
        }
        //string[row][column]
        dinner[0][1] = "Grapes";
        for(String[] table : dinner)
        {
            for(String served:table)
            {
                System.out.print(served+" ");
            }
            System.out.println();
        }
    }
}
