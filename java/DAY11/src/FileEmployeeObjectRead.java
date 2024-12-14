import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileEmployeeObjectRead 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	
		
		FileInputStream fos = new FileInputStream("emp");
		ObjectInputStream oos = new ObjectInputStream(fos);
		
		Employee e1= (Employee) oos.readObject();
		Employee e2= (Employee) oos.readObject();
		Employee e3= (Employee) oos.readObject();
		
		
		e1.displayEmployee();
		e2.displayEmployee();
		e3.displayEmployee();
		
		
		fos.close();
		oos.close();
		
	}
	
	
}
