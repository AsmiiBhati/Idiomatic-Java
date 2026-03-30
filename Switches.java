import java.util.Scanner;

public class Switches
{
    public static void main(String[] args)
    {
        //switches are a replacement of multiple if else statements
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = sc.nextLine();
        // -> means 'do this'
        switch(day)
        {
            case "Monday", "monday" -> System.out.println("Its a week day!");
            case "Tuesday", "tuesday" -> System.out.println("Its a week day!");
            case "Wednesday","wednesday" -> System.out.println("Its a week day!");
            case "Thursday", "thursday" -> System.out.println("Its a week day!");
            case "Friday", "friday" -> System.out.println("Its a week day!");
            case "Saturday", "saturday" -> System.out.println("Its the weekend!");
            case "Sunday", "sunday" -> System.out.println("Its the weekend!");
            default -> System.out.println(day + " is not a valid day!");
        }
        /* the above can aso be written as (it'll give same output)
           case "Monday","Tuesday","Wednesday"..and so on -> System.out.println("Its a week day!");
           case "Saturday".. and so on -> System.out.println("Its the week end!");
           default -> System.out.println(day + " is not a valid day!");
        */
        sc.close();

    } 
}
