
public class TesthasARelation 
{

	public static void main(String[] args) 
	{
	
		Address add = new Address("karnataka","Blr",560008);
		
		Emp e = new Emp(1001,"shan",add);
		e.dispempDetails();
		
	} 
	
}
