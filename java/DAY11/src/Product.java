
public class Product
{

	int pid;
	String pname;
	float price;
	
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}
	public float getPrice() {
		return price;
	}

	public static void main(String[] args) 
	{
		Product p1 = new Product();
		p1.setPid(1001);
		p1.setPname("dell");
		p1.setPrice(20000);
		
		System.out.println(p1.getPid());
		System.out.println(p1.getPname());
		System.out.println(p1.getPrice());
		
		
		
	
	}
	
}
