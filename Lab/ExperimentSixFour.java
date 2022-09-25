import java.util.*;
interface Q
{
    public void division(int a,int b);
    public void modules(int p,int q);
}
class Solve implements Q
{
    public void division(int a,int b)
    {
        System.out.println("1: "+(a/b));
    }
    public void modules(int p,int q)
    {
        System.out.println("2: "+(p%q));
    }     
}
class C extends Solve 
{
    public void division(int a, int b)
    {
        super.division(a, b);
    }
    public void modules(int p,int q)
    {
        super.modules(p, q);    }
}
class ExperimentSixFour
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        C obj = new C();
        int a = 10;
        int b=5;
        int p=40;
        int q=20;
        obj.division(a,b);
        obj.modules(p,q);
    }
}