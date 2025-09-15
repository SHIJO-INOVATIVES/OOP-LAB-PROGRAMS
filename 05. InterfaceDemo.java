interface Shape
{
    void printArea(double a, double b);
}
class Rectangle implements Shape
{
    public void printArea(double a,double b)
    {
        System.out.println("Calculating area of Rectangle...");
        System.out.println("Area of Rectangle:"+(a*b));
    }
}
class Circle implements Shape
{
    public void printArea(double a,double b)
    {
        System.out.println("Calculating area of Circle...");
        System.out.println("Area of Circle:"+(3.14*a*b));
    }
}
class Triangle implements Shape
{
    public void printArea(double a,double b)
    {
        System.out.println("Calculating area of Triangle...");
        System.out.println("Area of Triangle:"+(0.5*a*b));
    }
}
public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Shape s;
        s=new Rectangle();
        s.printArea(2,5);
        s=new Circle();
        s.printArea(5,5);
        s=new Triangle();
        s.printArea(2,5);
    }
}
