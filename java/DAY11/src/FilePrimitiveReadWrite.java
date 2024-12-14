import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilePrimitiveReadWrite 
{

	public static void main(String[] args) throws IOException 
	{
	
		int id=1001;
		String name="shan";
		int sal=30000;
		
		FileOutputStream fos = new FileOutputStream("emp1");
		DataOutputStream ds = new DataOutputStream(fos);
		
		ds.writeInt(id);
		ds.writeUTF(name);
		ds.writeInt(sal);
		System.out.println("primitive write is over");
		
		
		FileInputStream fis = new FileInputStream("emp1");
		DataInputStream di = new DataInputStream(fis);
		
		System.out.println(di.readInt());
		System.out.println(di.readUTF());
		System.out.println(di.readInt());
		
		fis.close();
		di.close();
		
		
	}
	
}
