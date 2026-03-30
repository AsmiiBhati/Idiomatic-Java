public class Constructor
{
    //constructor = special method found in a class used to initialize object
    //with constructors, we can create objects with unique values
    /*when you create an object you can pass arguements to the constructor to setup
      initial values*/
    public static void main(String[] args)
    {
      //the constructor Student() has - name,age,gpa paraemters
      //when object is created the constructor is called on its own.
      //but you'll need a matching set of arguements if constructor has parameters.
      Student student1 = new Student("Alice",21,9.1,true);
      Student student2 = new Student("Bryan",22,8.7,true);
      Student student3 = new Student("Camilla",22,6.7,true);
      //here in sout we can't write student1.n since the actual class variable is name.
      System.out.println("Name: "+student1.name+" "+"Age: "+student1.age+" "+"GPA: "+student1.gpa+" ");
      System.out.println("Name: "+student2.name+" "+"Age: "+student2.age+" "+"GPA: "+student2.gpa+" ");
      System.out.println("Name: "+student3.name+" "+"Age: "+student3.age+" "+"GPA: "+student3.gpa+" ");

      student1.study();
      student2.study();
      student3.study();
    } 
}
class Student
{
    //this class is made to get used in "constructors.java" for better understanding
    String name;
    int age;
    double gpa;
    boolean isEnrolled;
    //constructor(same name as class)
    Student(String n,int a,double g,boolean isEn)
    {
        /*these are named as such only to understand that 'this' keyword is attached to the
        class variables.
        'this' refers to the current object (like student1 or student2).
        Parameters (n, a, g, isEn) are passed when the object is created,
        and they are used to initialize the class's actual variables.

        'this' refers to the object we are working with(student 1 then student 2 in this case)
        For example: this.name = n means "the object's name should be set to the value of n".
        */
        this.name = n;
        this.age = a;
        this.gpa = g;
        this.isEnrolled = isEn;
        //in your mind,you can replace 'this' with student1/student2 (objects)
        //say it like student1' name is the value of n we put in the constructor in main class
    } 
    void study()
    {//this.name is used,not n since we are inside a method, and actual parameters will be used here.
     //n is a temp parameter used just when the object is created, but name is permanent.
      System.out.println(this.name + " is studying.");
    } 
}
