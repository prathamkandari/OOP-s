import java.util.*;
class ExperimentEightFour
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String s = new String(str);
        System.out.println("The length of the string is " +s.length());
        int count=0,i=0;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a')
            {
                System.out.println("a is present at "+i);
                count=count+1;
            }
        }    
        System.out.println("YES a is present in your string: "+count); 
    }
}