package abc;
import java.sql.*;
public class ExperimentElevenThreeA {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Experiment","root","Prathamk123@");
			//Create Statement 
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from Meet;");
//			ResultSet rs = stmt.executeQuery("select Count(*) from Meeting where id=1144;");
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
