
public class Student 
{

	int sid;
	String name;
	static String cname;
	int mark;
	
	
	Student(int sid,String name,int mark)
	{
		this.sid =sid;
		this.name = name;
		this.mark = mark;	
	}
	
	public void displaystudent()
	{
		System.out.println(sid+ " "+name+ " "+cname+" "+mark);
	}
	
	public static void readcname()
	{
		cname = "DBDA";
	}
	
	public static void main(String[] args) 
	{
		readcname();
		
		Student s1 = new Student(1001,"shan",40);
		s1.displaystudent();
		
		Student s2 = new Student(1002,"raj",50);
		s2.displaystudent();
		
		
		Student s3 = new Student(1003,"siju",60);
		s3.displaystudent();
		
	}
	
}
