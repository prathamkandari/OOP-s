package Interfaces;

interface Shape
{
    int i=0;
    abstract double area();
    abstract double circumference();
}
class Rectangle implements Shape
{
    private double length,breadth;
    Rectangle(double l, double b)
    {
        length=l;
        breadth=b;
    }
    public double area()
    {
        return (length*breadth);
    }
    public double circumference()
    {
        return(2*(length+breadth));
    }
}
class Circle implements Shape 
{
    private double radius;
    Circle(double r)
    {
        radius=r;
    }
    public double area()
    {
        return(3.14*radius*radius);
    }
    public double circumference()
    {
        return(2*3.14*radius);
    }
}
public class TestDemo
{
    public static void main(String args[])
    {
        Shape [] s = new Shape[2];      //Array of objects 
        s[0]=new Rectangle(2,5);
        s[1]=new Circle(5);
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i].area());
            System.out.println(s[i].circumference());
        } 
    }
}