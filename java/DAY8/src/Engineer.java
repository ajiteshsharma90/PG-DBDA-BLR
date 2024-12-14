
public class Engineer extends Employee 
{

	public Engineer(int empid, String name, float sal) 
	{
		super(empid, name, sal);
		
	}

	
	float calculateBonus()
	{
		return sal+400;
	}
	
	
}
