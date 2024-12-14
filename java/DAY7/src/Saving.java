
public class Saving extends Account
{
	float ir;
	public Saving(int aid, String cname, float balance,float ir)
	{
		super(aid, cname, balance);
		this.ir = ir;
		
	}

	void displayir()
	{
		System.out.println(ir);
	}
	
    void findInterest()
    {
    	  float iamount = balance *ir;
    	  System.out.println(iamount);
    	  balance = balance + iamount;
    	  bbalance = bbalance +balance;
    	  
    }
    
    void getbalance()
    {
    	System.out.println(balance);
    }
	
}
