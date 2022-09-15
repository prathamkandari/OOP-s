import java.util.*;
class Employee
{
    String name;
    String empid;
    int Salary;
    Employee()
    {
        name="";
        empid="";
        Salary=0;
    }
    Employee(String n, String id, int s)
    {
        name=n;
        empid=id;
        Salary=s;
    }
    String names()
    {
        return name;
    }
    int Salaries()
    {
        return Salary;
    }
    double increaseSalary(double rate)
    {
        double cal=(Salary*(rate/100));
        double new_salary=Salary+cal;
        return new_salary;
    }
}
class Maanager extends Employee
{
    public String department="d";
}
class ExperimentFourFive 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String n=sc.nextLine();
        System.out.println("Enter the employee id");
        String id=sc.nextLine();
        System.out.println("Enter the Salary");
        int s=sc.nextInt();
        System.out.println("Enter the percentage increase in the salary");
        double r=sc.nextDouble();
        Employee ob = new Employee(n,id,s);
        System.out.println(ob.names());
        System.out.println(ob.Salaries());
        System.out.println(ob.increaseSalary(r)); 
    }
}