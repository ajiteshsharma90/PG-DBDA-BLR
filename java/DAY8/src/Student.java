
public class Student
{
    int id;
    
    void dstudent()
    {
    	System.out.println(id);
    }
}


class testObject
{
	
	public static void main(String[] args) 
	{
		Student s = new Student();
		System.out.println(s.hashCode());
		
	}
	
}
