public class Super 
{
    public static void main(String[] args)
    {
        //super = another name for parent class (super class --> sub class)
        //used in method overidding and contructors
        Person person = new Person("Alice","Olsen");
        System.out.println(person.firstname);
        person.showName();

        Student student = new Student("Bob","Freeman",8.9);
        student.showName();

        Employee employee = new Employee("Cathy","Davids",101);
        employee.showName();

        // All three showName() methods override the same method from the parent class.
        // This is called method overriding (not method overloading, which is when method names are same but parameters differ).

    }
}
class Person//super class
{
    String firstname;
    String lastname;

    Person(String firstname,String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    void showName()
    {
        System.out.println(firstname + " " + lastname);
    }
}

class Student extends Person //student is subclass
{
    double gpa;

    Student(String firstname,String lastname,double gpa)
    {
        super(firstname,lastname);//we recieve them through Person, there is no nee dto write "this." for them
        this.gpa = gpa;
    }
    void showName()
    {
        System.out.println(firstname + " " + lastname + "\nGPA : " + gpa);
    }
}

class Employee extends Person
{
    int eID;

    Employee(String firstname,String lastname,int eID)
    {
        super(firstname,lastname);
        this.eID = eID;
    }
    void showName()
    {
        System.out.println(firstname + " " + lastname + "\nEmployee ID : " + eID);
    }
}