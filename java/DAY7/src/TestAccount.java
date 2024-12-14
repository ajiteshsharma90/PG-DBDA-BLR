
public class TestAccount
{

	public static void main(String[] args) 
	{
	
		Saving s1 = new Saving(1001,"shan",30000,0.05f);
		s1.dispAccount();
		s1.displayir();
		s1.findInterest();
		s1.getbalance();
		
		Saving s2 = new Saving(1002,"raj",50000,0.05f);
		s2.dispAccount();
		s2.displayir();
		s2.findInterest();
		s2.getbalance();
		
		Account.totalBalance();
		
	}
}
