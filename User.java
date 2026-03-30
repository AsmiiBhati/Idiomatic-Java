public class User
{
    //this is made to use in "overloadedconstructors.java" for better understanding

    //lets say that the following three are optional fields(attributes) i.e we may or may not recieve them
    String username;
    String useremail;
    int age;

    //this constructor has no arguments so sets all fields to default values
    User()
    {
        this.username = "Guest";
        this.useremail = "not needed";
        this.age = 0;
    }

    User(String uname)
    {
        //in this constructor email and age is optional so we just assign them default value
        this.username = uname;
        this.useremail = "Not Provided";//default value for email
        this.age = 18;//default value for age
    }
    //we can create many constructor with same name but we will need different parameters
     User(String uname,String uemail)
    {
        //in this constructor, age is optional so we just assign them default value
        this.username = uname;
        this.useremail = uemail;
        this.age = 18;//default value for age
    }
    User(String uname,String uemail,int uage)
    {
        this.username = uname;
        this.useremail = uemail;
        this.age = uage;
    }
}
