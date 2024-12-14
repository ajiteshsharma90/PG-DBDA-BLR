import java.util.Scanner;

 public class Netbanking 
{
     
	 public void paymentprocess(float amount)
	{
		System.out.println("amount pid ");
	}
}

class sbi extends Netbanking
{
	public void paymentprocess(float amount)
	{
		System.out.println("Rs."+amount + " amount pid using sbi ");
	}
}

class Axis extends Netbanking
{
	public void paymentprocess(float amount)
	{
		System.out.println("Rs."+amount + " amount pid using Axis ");
	}
}

class icici extends Netbanking
{
	public void paymentprocess(float amount)
	{
		System.out.println("Rs."+amount + " amount pid using icici ");
	}
}

class testRuntimepolymorphism
{
	
	public static Netbanking createbankobject(String bname) 
	{
		if(bname.equals("sbi"))
		{
			sbi s = new sbi();
			return s;
		}
		
	    else if(bname.equals("icici"))
	{
		return new icici();
	}
	    else if(bname.equals("Axis"))
		{
			return new Axis();
		}else 
			return null;
	}  
	
	
	public static void main(String[] args) 
	{
	    Netbanking n;
	    
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the bank name to process payment");
	    String bname = sc.next();
	    
	   n =createbankobject(bname);
	    n.paymentprocess(2000);
	    
//		n = new sbi();
//		n.paymentprocess(1000);
//		
//		n= new icici();
//		n.paymentprocess(2000);
//		
//		n = new Axis();
//		n.paymentprocess(3000);
		
	}

	
	
	
	
}






