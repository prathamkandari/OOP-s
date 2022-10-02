import java.util.*;
public class ExperimentSevenSix
{
    public static void main(String args[])
    {
        Scanner S1=new Scanner(System.in);
        int a,b,div;
        System.out.print("Input both a and b : ");
        try 
        {
            a = S1.nextInt();
            b = S1.nextInt();
            div = a / b;
            System.out.println("Result : "+div);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}