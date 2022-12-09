package abc;
import java.sql.*;
public class ExperimentElevenThreeE {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Experiment","root","Prathamk123@");
			//Create Statement 
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Meet where time='Tuesday';");
//			ResultSet rs = stmt.executeQuery("select Count(*) from Meet where id=1105;");
			System.out.println("Participants attending Tuesday meetings");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			
			conn.close();
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
