import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileStringRead
{

	public static void main(String[] args) throws IOException 
	{
	
		FileReader fr = new FileReader("dbda");
		
		//reading char by char
		
//		  char ch = (char)fr.read();
//		  
//		  System.out.println(ch);
//		   int ch;
//		  while((ch = fr.read())!=-1)
//		  {
//			  System.out.print((char)ch);
//		  }
//		
		
	//read line by line
		
		BufferedReader br = new BufferedReader(fr);
//		String str1=br.readLine();
//		String str2=br.readLine();
//		System.out.println(str1);
//		System.out.println(str2);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		
		
	}
	
}
