import java.util.*;
class ExperimentSevenTwo
{  
    static int a,b;
    public static void main(String args[])
    {
        try
        {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[2]); 
            if(args[1].equals("+"))
            {
                System.out.println(a+b);
            }
        }
        catch(NumberFormatException e)
        {
            System.out.print("Wrong input entered");
        }
    }
}