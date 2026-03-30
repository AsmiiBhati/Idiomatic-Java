public class Abstraction
{
    public static void main(String[] args)
    {
        //abstraction = process of hiding details and showing only the essential features
        //abstract = keyword to make class and methods abstract
        //abstract can't be instantiated directly ie we can't create any object from this class,they can contain abstract methods(need to be used) and concrete methods(real methods that were inherited from the abstract class)

        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(12,11);
        Rectangle rectangle = new Rectangle(20,9);
        circle.display();
        triangle.display();
        rectangle.display();

        double circlearea = circle.area();
        System.out.println("Area of circle is: "+ circlearea);
        double trianglearea = triangle.area();
        System.out.println("Area of triangle is: "+trianglearea);
        double reactanglearea = rectangle.area();
        System.out.println("Area of rectangle: "+reactanglearea);
        
    }
}
abstract class Shape //we can't create objects in this class since its abstract
{
    //an abstract method must be implemented/used by the parent's children
    abstract double area();

    void display()//concrete method
    {
        System.out.println("This is a shape!");
    }
}
class Circle extends Shape
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    double area()
    {
        return Math.PI*radius*radius;
    }
}
class Triangle extends Shape
{
    double base;
    double height;
    Triangle(double base,double height)
    {
        this.base = base;
        this.height = height;
    }
    @Override
    double area()
    {
        return 0.5*base*height;
    }
}
class Rectangle extends Shape
{
    double base;
    double height;
    Rectangle(double base,double height)
    {
        this.base = base;
        this.height = height;
    }
    @Override
    double area()
    {
        return base*height;
    }
}