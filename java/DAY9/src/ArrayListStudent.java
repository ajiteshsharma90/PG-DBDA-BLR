import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudent
{

	public static void main(String[] args) 
	{
	
		StudentManagement sm = new StudentManagement();
		
		ArrayList<Student> al=sm.createStudentArrayList();
		
		sm.DisplayStudentArrayList(al);
		
		sm.updateStudentArrayList(al);
		
		sm.DisplayStudentArrayList(al);
		
		sm.DeleteStudentArrayList(al);
		
		sm.DisplayStudentArrayList(al);
	}
	
	
	
	
	
}
