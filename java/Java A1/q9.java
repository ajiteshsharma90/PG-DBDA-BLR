/* 9) Prime Number Checker: Write a program that takes an integer input from the user and checks 
		if the number is a prime number. A prime number is a number greater 
		than 1 that has no positive divisors other than 1 and itself. 
		Print whether the number is prime or not.
*/

package assignment1;

import java.util.Scanner;

public class q9 
{
	private static void prime_number(int number) 
	{
		int num = 0;
		
		if (number < 1)
			System.out.println("Enter a number greater than 1");
		
		for(int i = 2;i<number;i++) {
				if (number % i == 0)
					num++;	 	
			}
		if (num > 0)
			System.out.println(number + " is not a Prime Number");
		else
			System.out.println(number + " is a Prime Number");
		
		
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int number = s.nextInt();
		prime_number(number);
		s.close();
	}

	
}
