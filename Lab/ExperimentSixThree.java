import java.util.*;
interface Area
{
    public static final double PI=3.14;
    void area();
}
class Circle implements Area
{
    int radius;
    Circle(int r)
    {
        radius = r;
    }
    public void area()
    {
        System.out.println("The area of the circle is "+ (PI*radius*radius));
    }
}
class Rectangle implements Area
{
    int length,breadth;
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public void area()
    {
        System.out.println("The area of the rectangle is "+ (length*breadth));
    }
}
class ExperimentSixThree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        Circle ob1=new Circle(r);
        Area t;
        t=ob1;
        ob1.area();
        int l=sc.nextInt();
        int b=sc.nextInt();
        Rectangle ob2=new Rectangle(l, b);
        Area p;
        p=ob2;
        ob2.area();
    }
}