 class D
{
    int i;
    
//    D()
//    {
//    	System.out.println("default D");
//    }
   
    D()
    { this .i = i;
    	System.out.println("parameter D");
    }
    
}
class E extends D
{
	int j;
	
//	E()
//	{
//		
//		System.out.println("default E");
//	}
	
	E(int i,int j)
	
	{   super(i);
		this.j = j;
		
		System.out.println("parameter  E");
	}
	
}

public class TestConstructor
{
	public static void main(String[] args) 
	{
		
		E e = new E(6,10);
	}
}