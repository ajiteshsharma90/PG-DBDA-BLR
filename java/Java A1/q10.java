/*10) FizzBuzz Program: Write a program that prints the numbers from 1 to 100. 
For multiples of three, print "Fizz" instead of the number, 
and for multiples of five, print "Buzz". 
For numbers which are multiples of both three and five, print "FizzBuzz".
*/


package assignment1;

public class q10 {
	
	public static void FizzBuzz() 
	{
		for (int i = 1; i <= 100; i++ )
			if (i%3 ==0 && i%5 != 0)
				System.out.println("Fizz");
			else if (i%5 == 0 && i%3 !=0)
				System.out.println("Buzz");
			else if (i%3 == 0 && i%5 == 0)
				System.out.println("FizzBuzz");
			else 
				System.out.println(i);
	}
		

	public static void main(String[] args) 
	{
		FizzBuzz();
		
	}

}
