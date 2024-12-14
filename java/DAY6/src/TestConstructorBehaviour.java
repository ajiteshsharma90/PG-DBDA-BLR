class Emp 
{
	  int id;
	  String name;
	public Emp(int id, String name)
	{
		
		this.id = id;
		this.name = name;
	}

	void displayDetails()
	{
		System.out.println(id+" "+name);
	}
	
}

class Manager extends Emp
{
	   String  profile;
	   
	   
	 public  Manager(int id,String name,String profile)
	   {
		    super(id,name);
		 
		   this.profile = profile;
	   }
	   
	 void displayManager()
	 {
		 System.out.println(profile);
	 }
	 
	 
	 
}


public class TestConstructorBehaviour
{

	public static void main(String[] args) 
	{		
	
		Manager m = new Manager(1001,"shan","Admin");
		m.displayDetails();
	    m.displayManager();
	}
	
}



