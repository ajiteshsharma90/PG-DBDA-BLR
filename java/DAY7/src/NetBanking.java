
public class NetBanking 
{

	void payment(float amount)
	{
		System.out.println("payment using NetBaning "+ amount);
	}
	
}

class sbi extends NetBanking
{
	void payment(float amount)
	{
		System.out.println("paid using sbi "+ amount);
	}
}

class icici extends NetBanking
{
	void payment(float amount)
	{
		System.out.println("paid using icici "+ amount);
	}
}



class Axis extends NetBanking
{
	void payment(float amount)
	{
		System.out.println("paid using Axis "+ amount);
	}
}



class testOverriding
{
	
	public static void main(String[] args) 
	{
	
		NetBanking n;
		
		n = new sbi();
		n.payment(3000);
		
		n = new icici();
		n.payment(2000);
		
		n = new Axis();
		n.payment(1000);
			
		
		
		
	}
	
	
	
}



