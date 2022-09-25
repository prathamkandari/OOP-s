import java.util.Scanner;

import java.util.*;
interface Test
{
    public void square(int a);
}
class Arithmetic implements Test
{
   @Override // Override is used to run all in asingle program
    public void square(int a) {
        // TODO Auto-generated method stub
        System.out.print(a*a);
    }
}
class ToTestInt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Arithmetic ob = new Arithmetic();
        int a = sc.nextInt();
        Test t;
        t=ob;
        t.square(a);
    }
}