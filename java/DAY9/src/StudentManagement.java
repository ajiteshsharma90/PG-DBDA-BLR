import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement
{

	
	public ArrayList<Student> createStudentArrayList()
	{
		Student s1 = new Student(1001,"nsnathan",40);
		Student s2 = new Student(1002,"nathan",50);
		Student s3 = new Student(1003,"shan",60);
		
		
		ArrayList<Student>  al = new ArrayList<>();
		System.out.println("object get added");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		return al;
		
		
	}

	public void DisplayStudentArrayList(ArrayList<Student> al ) 
	{
        System.out.println("display student");
		
		for( Student s :al)
		{
			s.display();
		}
		
	}

	public void updateStudentArrayList(ArrayList<Student> al)
	{
		int sid;
		System.out.println("enter the student id,mark");
          Scanner sc = new Scanner(System.in);
          sid = sc.nextInt();
		    int m  = sc.nextInt();
		
		    for( Student s :al)
			{
				
		    	if(s.id == sid)
		    	{
		    		s.mark=m;
		    	}
		    	
			}

		
	}

	public void DeleteStudentArrayList(ArrayList<Student> al)
	{
		System.out.println("delete");
	    
		 Scanner sc = new Scanner(System.in);
	    System.out.println("enter the student id to delete");
          
         int sid = sc.nextInt();
	    
	    int pos =0;
          for( Student s :al)
			{
				
		    	if(s.id == sid)
		    	{
		    		pos=al.indexOf(s);
		    		
		    	}
		    	
			} 
          al.remove(pos);

		
	}
	
	
	
}
