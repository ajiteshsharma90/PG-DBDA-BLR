
public class MethodExample
{
    public static void sayHello(String name)
    {
    	System.out.println("welcome " + name);
    }
	
	public static void main(String[] args) 
	{
		String name = "nsnathan";
		sayHello(name);
		System.out.println("inside the main");
		
	}
	
}
