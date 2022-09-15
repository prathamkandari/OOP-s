import java.util.*;
class Worker 
{
    String name;
    Worker(String n)
    {
        name = n;
    }
    void Show()
    {
        System.out.println("Name is: "+name);
    }
}
class DailyWorker extends Worker 
{
    int rate;
    DailyWorker(String n, int r)
    {
        super(n);
        rate = r;
    }
    void compay(int hours)
    {
        Show();
        System.out.println("Salary is: "+(hours*rate));
    }
}
class SalariedWorker extends Worker
{
    int rate;
    SalariedWorker(String n, int r)
    {
        super(n);
        rate=r;
    }
    int hours=40;
    void compay()
    {
        Show();
        System.out.println("Salary is: "+(hours*rate));
    }
}

class ExperimentFourThree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        DailyWorker ob = new DailyWorker("Rahul",5);
        System.out.println("Enter the hours of the worker");
        int hours = sc.nextInt();
        ob.compay(hours);
        SalariedWorker ob1 = new SalariedWorker("Ohm",10);
        ob1.compay();
    }
}