
public class Account 
{
     int aid;
     String cname;
     float balance;
     static float bbalance;
     
	public Account(int aid, String cname, float balance) 
	{
		
		this.aid = aid;
		this.cname = cname;
		this.balance = balance;
	}
     
     void  dispAccount()
     
     {   
    	 System.out.println(aid+cname+balance);
     }
	
	public  static void  totalBalance()
	{
		System.out.println("total bank balance " +bbalance );
	}
     
}
