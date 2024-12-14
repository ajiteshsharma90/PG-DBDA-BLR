import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileEmployeeOBjectWrite 
{

	
	public static void main(String[] args) throws IOException 
	{
	
		Employee e1 = new Employee(1001,"raj",30000);
		Employee e2 = new Employee(1002,"nsnathan",40000);
		Employee e3 = new Employee(1003,"siju",50000);
				
		FileOutputStream fos = new FileOutputStream("emp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		
		fos.close();
		oos.close();
		
		System.out.println("object wirte is over");
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
