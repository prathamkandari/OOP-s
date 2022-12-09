package abc;
import java.sql.*;
import java.util.*;

public class ExperimentElevenTwo {
	static Scanner sc = new Scanner(System.in);
	static boolean choice()
	{	System.out.println("Press 1 to enter values, 0 to stop");
		int choice=sc.nextInt();
		if(choice==1)
		return true;
		else return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","Prathamk123@");
			Statement stmt = conn.createStatement();
//			int n = stmt.executeUpdate("create table comp(name varChar(30),id integer,salary integer);");
//			System.out.println(n);
			PreparedStatement pstmt=conn.prepareStatement("Insert into comp Values(?,?,?);"); 
			while(choice())
			{
			System.out.println("Enter the name,id and salary");
			sc.nextLine();
			String nm=sc.nextLine();
			int id=sc.nextInt();
			int salary=sc.nextInt();
			pstmt.setString(1,nm);
			pstmt.setInt(2,id);
			pstmt.setInt(3,salary);
			pstmt.executeUpdate();
			}
		ResultSet rs=stmt.executeQuery("select * from comp;");
		try {
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
			}
		}
		catch(SQLException e)
		{
		}
		conn.close();
		sc.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	finally{
		System.out.println("DONE");
	}
	}
}
