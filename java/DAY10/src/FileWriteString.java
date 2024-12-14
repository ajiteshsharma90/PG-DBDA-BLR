import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteString 
{

	public static void main(String[] args) throws IOException 
	{
	   String str1;
		FileWriter fw = new FileWriter("dbda",true);
		
		System.out.println("enter the data to write to the file");
		Scanner s = new Scanner(System.in);
		str1 = s.nextLine();
		String str2 = s.nextLine();
		
		
		fw.write(str1+'\n');
		fw.write(str2+'\n');
		System.out.println("file write is over");
		
		fw.close();
		
	}
	
}
