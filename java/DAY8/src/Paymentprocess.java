import java.util.LinkedList;
import java.util.Stack;

public interface Paymentprocess 
{

	 void payment();
	
}

class Creditcard implements Paymentprocess
{

	@Override
	public void payment()
	{
	System.out.println("paid using Creditcard");	
		
	}
	
	
	
}

class Debitcard implements Paymentprocess
{

	
	public void payment() {
		
		System.out.println("paid using Debitcard");
	}
	
	
	
}

class Testinterface
{
	public static void main(String[] args) 
	{
		Creditcard c = new Creditcard();
		c.payment();
		Debitcard d = new Debitcard();
		d.payment();
		
		LinkedList s = new LinkedList();
		s.add(10);
		
				
	}
	
		
}
