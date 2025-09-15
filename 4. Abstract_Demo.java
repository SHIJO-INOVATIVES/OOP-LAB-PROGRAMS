import java.util.*;

    abstract class Shape
    {
        int x,y;
        abstract void area(double x,double y);


    }
    class Rectangle extends Shape
    {
        void area(double x,double y)
        {
            System.out.println("Area of rectangle is:"+(x*y));
        }
    }
    class Circle extends Shape{
        void area(double x,double y)
        {
            System.out.println("Area of circle is:"+(3.14*x*x));
        }
    }
    class Triangle extends Shape
    {
        void area(double x,double y)
        {
            System.out.println("Area of triangle is:"+(0.5*x*y));
        }
    }
    public class Abstract_Demo
    {
        public static void main(String[] args)
        {
            Rectangle r=new Rectangle();
            r.area(2,5);
            Circle c=new Circle();
            c.area(5,5);
            Triangle t=new Triangle();
            t.area(2,5);
        }
    }
