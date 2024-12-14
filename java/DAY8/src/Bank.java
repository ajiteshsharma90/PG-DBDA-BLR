
abstract public class Bank 
{
	int cid;
	String cname;
	float balance;
	
	
	public Bank(int cid, String cname, float balance) {
		
		this.cid = cid;
		this.cname = cname;
		this.balance = balance;
	}
	void displaycustomer()
	{
		System.out.println(cid+cname+balance);
	}
	abstract void calculateinterest();
	
	
}

class abc extends Bank
{
	
	public abc(int cid, String cname, float balance) {
		super(cid, cname, balance);
		
	}

	public void calculateinterest()
	{
		System.out.println("rate of interest is 2%");
	}
	
}
class hdfc extends Bank
{
	
	public hdfc(int cid, String cname, float balance) {
		super(cid, cname, balance);
		
	}

	public void calculateinterest()
	{
		System.out.println("rate of interest is 3%");
	}
	
}



class testabstraction
{
	public static void main(String[] args) 
	{
	
		abc a = new abc(1001,"shan",3000);
		a.calculateinterest();
		a.displaycustomer();
		hdfc h = new hdfc(1002,"raj",4000);
		h.calculateinterest();
		h.displaycustomer();
		
	}
}