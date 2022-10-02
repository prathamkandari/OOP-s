import java.util.*;
class ExperimentSevenThree
{
    public static void main(String args[])
    {
        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]); 
            if(args[1]=="+")
            {
                System.out.println(a+b);
            }
        }
        catch(NumberFormatException e)
        {
            System.out.print(e);
        }
    }
}