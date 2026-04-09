import java.util.Scanner;
public class SubString
{
    public static void main(String[] args)
    {
    // string.substring(start, end) is a method to get a portion of the whole string.
    //String email = "itsalongmail@gmail.com";
    //String email = "itsalongmail56@gmail.com";
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter email: ");
    String email = sc.nextLine();
    String username = email.substring(0,email.indexOf('@'));
    String username1 = email.substring(0,12);
    String domain = email.substring(13,22);
    //if we want to to get everything after a specific index, we don't need to put the end limit.
    String domain1 = email.substring(13);
    // these methods are fixed, if we change the string these won't change thus giving wrong output.
    // instead of changing them manually everytime, we use indexOf() method.
    String domain2 = email.substring(email.indexOf('@') + 1); // + 1 to start after @, and not include @

    if(email.contains("@"))
    {
        System.out.println("Username: "+username); //flexible
        System.out.println("Username: "+username1); //rigid
        System.out.println("Domain: "+domain); //rigid
        System.out.println("Domain: "+domain1); //rigid
        System.out.println("Domain: "+domain2); // flexible, this is the only accurate domain.
    }
    else
    {
        System.out.println("Not a valid mail.");
    }

    sc.close();
    }
}
