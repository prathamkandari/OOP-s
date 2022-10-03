import java.util.*;
public class StackClass implements StackInterface{
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        int ch,size;
        boolean c=true;
        int stk[ ] = new int[10];
        StackClass sc = new StackClass();
        while(c){
            System.out.println("\n............... Stack ...............\n");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit\n");
            System.out.print("Enter your choice : ");
            ch = s1.nextInt();

            switch(ch){
                case 1:{
                    System.out.println("\n........... Push ...........\n");
                    System.out.print("Enter the number to be Pushed in the Stack : ");
                    int num = s1.nextInt();
                    sc.push(stk,num);
                    break;
                }
                case 2:{
                    System.out.println("\n........... Pop ...........\n");
                    sc.pop(stk);
                    break;
                }
                case 3:{
                    System.out.println("\n........... Display ...........\n");
                    sc.display(stk);
                    break;
                }
                case 4:{
                    System.out.println("\n........... Exit ...........\n");
                    c=false;
                    break;
                }
                default :
                    System.out.println("!!!!!!!!!! Wrong Choice !!!!!!!!!!");
            }
        }
    }
    int top = -1;
    public void push(int stk[],int num){
        if(top<10) {
            int c=++top;
            stk[c]=num;
        }
        else{
            System.out.println("Stack Overflow");
        }
        System.out.println("\nThe Element is placed in the Stack\n");
    }
    public void pop(int stk[]){
        System.out.println("The Element "+stk[top]+" from the index "+(top+1)+" Poped up from the Stack");
        if(top>=0){
            top--;
        }
        else{
            System.out.println("Stack Underflow");
        }
        System.out.println("");
    }
    public void display(int stk[]){
        for(int i=top;i>=0;i--) {
            System.out.print("|"+stk[i]+"|");
        }
        System.out.println("\n");
    }
}
interface StackInterface{

    void push(int stk[],int num);
    void pop(int stk[]);
    void display(int stk[]);
}
    