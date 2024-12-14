import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatement 
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbda","root","cdacacts");
		
		System.out.println("jdbc connection got");
		
		Statement smt=con.createStatement(); 
		
		String query ="select * from emp";
		
		ResultSet rs = smt.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+rs.getString(2)+rs.getFloat(6));
			
		}
		
		rs.close();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
