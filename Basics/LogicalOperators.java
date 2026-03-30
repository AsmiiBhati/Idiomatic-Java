public class LogicalOperators
{
    public static void main(String[] args)
    {
        // && = AND -> both condition true
        // || = OR -> either condition true
        // ! = NOT -> should not be true

        int temp = 97;
        if(temp >= 96 && temp <= 99)
        {
            if(temp != 97)
            {
                System.out.println("You have normal temperature.");
                System.out.println("But, You don't have ideal temperature.");
            }
            else
            {
                System.out.println("You have ideal temperature.");
            }
        }
        else if(temp<= 0 || temp>= 110)
        {
            System.out.println("invalid temperature");
        }
        else
        {
            System.out.println("You don't have normal temperature.");
        }
    }  
}
