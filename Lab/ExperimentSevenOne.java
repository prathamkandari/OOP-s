import java.util.*;
class ExperimentSevenOne 
{
    public static void main(String args[])
    {
        try
        {
            int a[]={1,2,3,4,5,6,7,8,9,10};
            String b[]={"A","B","C","D","E","F","G","H","I","J"};
            int i=0;
            for(i=0;i<10;i++)
            {
                System.out.println(a[i]+" "+b[11]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("Enter the correct index!!!");
        }
    }
}