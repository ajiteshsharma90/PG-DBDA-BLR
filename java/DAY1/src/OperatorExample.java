
public class OperatorExample 
{

	public static void main(String[] args) {
		
		//increment //decrement
		//int a = 0;
				
//		System.out.println(a);
//		System.out.println(a++);
//		System.out.println(++a);
		
		//arithmetic
		
		int a = 5;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//relational
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//logical
				
		int c =20;
		int d = 40;
		System.out.println("------------------");
		System.out.println(a>b && c>d);
		System.out.println(a>b || c>d);
		
	//assigment
		
		System.out.println(a+=10);
		
		
  //ternary
		int mark = 40;
	String result = (mark>16)? "pass" :"fail";
	
	System.out.println(result);
		
		
	}
	
	
	
}
