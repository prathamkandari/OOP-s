import java.util.*;
class prompt extends Exception
    {
        prompt(String s)
        {
            System.out.println(s);
        }
    }
class ExperimentSevenThreePart2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n=sc.nextInt();
            if(n < 500)
                throw new prompt("No is less than 500");
            else 
                throw new prompt("No is greater than 500");
        }
        catch(prompt e)
        {
            System.out.println(e.getMessage());
        }
    }
}