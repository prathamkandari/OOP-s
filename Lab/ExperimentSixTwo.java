interface A
{
    public void meth1();
    public void meth2();
}
class MyClass implements A
{
    public void meth1()
    {
        System.out.println("This is Method 1");
    }
    public void meth2()
    {
        System.out.println("This is method 2");
    }
}
class ExperimentSixTwo
{
    public static void main(String args[])
    {
        MyClass ob = new MyClass();
        A t;
        t=ob;
        t.meth1();
        t.meth2();
    }
}