import java.util.*;
public class ExperimentSevenSeven 
{
    public static void main(String args[])
    {
        Scanner S1 = new Scanner(System.in);
        int a,b;
        System.out.print("Input a and b values : ");
        try 
        {
            a=S1.nextInt();
            b=S1.nextInt();
            if (a < 0 || b < 0) 
            {
                throw new except();
            }
            if(a==0||b==0)
            {
                throw new arithmetic();
            }
            Calc t = new Calc();
            long result=t.Calc(a,b);
            System.out.println("Result : "+result);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class except extends Exception
{
    except()
    {
        super("a and b should not be negative\n");
    }
}
class arithmetic extends Exception
{
    arithmetic()
    {
        super("a and b should not be zero\n");
    }
}
class Calc
{
    long Calc(int a,int b)
    {
        int power=1,i;
        for(i=0;i<b;i++){
            power=power*a;
        }
        return power;
    }
}