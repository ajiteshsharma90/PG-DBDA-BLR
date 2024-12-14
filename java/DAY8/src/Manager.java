
public class Manager extends Employee
{
    final int t =1001;
	public Manager(int empid, String name, float sal)
	{
		super(empid, name, sal);
		
	}
    
	float calculateBonus()
	{
		return sal+200;
	}
}
