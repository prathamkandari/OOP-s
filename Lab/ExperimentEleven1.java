package abc;
import java.sql.*;
public class ExperimentElevenOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCQ1","root","Prathamk123@");
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate("insert into Experiment Values(2,'Pratham',300000);");
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
