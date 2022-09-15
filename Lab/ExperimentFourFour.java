class Trunk_Call
{
    int ordinary_rate = 10;
    int urgent_rate = 20;
    int lightning_rate = 30;
}
class Ordinary extends Trunk_Call
{
    void charges(int hours)
    {
        System.out.println(ordinary_rate*hours);
    }
}
class Urgent extends Trunk_Call
{
    void charges(int hours)
    {
        System.out.println(urgent_rate*hours);
    }
}
class Lightning extends Trunk_Call
{
    void charges(int hours)
    {
        System.out.println(lightning_rate*hours);
    }
}

class ExperimentFourFour
{
    public static void main(String args[])
    {
        Ordinary ob = new Ordinary();
        ob.charges(4);
        Urgent ob1 = new Urgent();
        ob1.charges(5);
        Lightning ob2 = new Lightning();
        ob2.charges(10);
    }
}