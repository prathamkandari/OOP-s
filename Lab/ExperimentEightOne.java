import java.util.*;
public class ExperimentEightOne
{
    String sq;
    String str;
    public ExperimentEightOne(String stp, String s)
    {
        sq=stp;
        str=s;
    }
    void Ocuurences(String stp,String str)
    {
        int i=0;
        System.out.print("First Occurence is :");
        int a=str.indexOf(stp);
        System.out.println(a);
        System.out.print("Last Occurence is :");
        int b=str.lastIndexOf(stp);
        System.out.println(b);
        String p=str.substring(a,b+1);
        System.out.println(p);
        int count=0;
        
        // for(i=0;i<str.length();i++)
        // {
        //     char ct=str.charAt(i);
        //     char cq=p.charAt(i);
        //     if(ct==cq)
        //     {
        //         count=count+1;
        //     }
        //     else{
        //         break;
        //     }
        // }
        System.out.println("The total occurence is "+count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=sc.nextLine();
        System.out.println("Enter the substring or the character whose first and last index you want to print");
        String sub=sc.nextLine();
        ExperimentEightOne ob = new ExperimentEightOne(sub,st);
        ob.Ocuurences(sub, st);
    }
}