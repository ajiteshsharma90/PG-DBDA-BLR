
public class Emp
{

	int eid;
	String ename;
	Address add;
	public Emp(int eid, String ename, Address add) 
	{
		this.eid = eid;
		this.ename = ename;
		this.add = add;
	}
	
	void dispempDetails()
	{
		System.out.println(eid+ename+add.city+add.state+add.pin);
		
	}
	
}
