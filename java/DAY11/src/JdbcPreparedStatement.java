import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcPreparedStatement 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		int dno;
		PreparedStatement pmt;
     Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbda","root","cdacacts");
		
	  System.out.println("jdbc connection got");
	  
	  //select
	  System.out.println("enter the empno");
	     String query = "Select * from emp where deptno = ?";
	     pmt = con.prepareStatement(query);
	  
	 Scanner sc = new Scanner(System.in);
	  dno = sc.nextInt();
	 pmt.setInt(1, dno);
	 ResultSet rs =pmt.executeQuery();
	 
	 while(rs.next())
		{
			System.out.println(rs.getInt(1)+rs.getString(2)+rs.getFloat(6) + rs.getInt(8));
			
		}
	 
	 //update
	 
	 
	   String q1 = "update emp set sal = sal + ? where empno = ?";
	    pmt = con.prepareStatement(q1);
	    int eno;
	    System.out.println("enter the bonus and the empno to update");
	    eno = sc.nextInt();
	    float bonus = sc.nextFloat();
	    
	    pmt.setFloat(1, bonus);
	    pmt.setInt(2, eno);
	    
	    int nr=pmt.executeUpdate();
	    System.out.println(nr +" Records updated");
	    
	    
	    //delete
	    
	    
	    String q2 = "delete from emp where empno = ?";
	    pmt = con.prepareStatement(q2);
	    
	    System.out.println("enter the empno to delete");
	     eno = sc.nextInt();
	     pmt.setInt(1, eno);
	     int nr1=pmt.executeUpdate();
		    System.out.println(nr1 +" Records deleted");
	    
	    
	 con.close();
	 pmt.close();
	 rs.close();
	 
	           
	            
	            
	           
	  
	  
	}
}
