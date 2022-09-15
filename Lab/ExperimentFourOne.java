class A
{
    private int a=10;
    private int b=20;
}
class B extends A
{
    void add()
    {
        int c=a+b;
        System.out.println(c);
        System.out.println("In Class B");
    }
}
class ExperimentFourOne
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.add();
    }
}