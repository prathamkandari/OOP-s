import java.util.*;
interface StackInterface
{
    public void push();
    public void pop();
    public void display();
}
class StackClass implements StackInterface
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StackClass obj = new StackClass();
        System.out.println("Enter 1 for Push");
        System.out.println("Enter 2 for Pop");
        System.out.println("Enter 3 for Display");
        int choice = sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        int element = sc.nextInt();
        int top=-1;
        StackInterface t;
        t=obj;
        switch(choice)
        {
            case 1:     
                        if(top==n-1)
                        {
                            System.out.println("Stack Overflow");
                        }
                        else
                        {
                            top=top+1;
                            arr[top]=element;
                        }
            case 2:
                        if(top==n-1)
                        {
                            System.out.println("Stack Underflow");
                        }
                        else 
                        {
                            top=top--;
                        }
                    {
                        int i=0;
                        for(i=top;i>=0;i--)
                        {
                            System.out.print(a[i]+" ");
                        }
                    }

        }
    }
}

    