// 6) Sum of Digits: Create a program that calculates the sum of the digits of a given integer. 
//    For example, if the input is 123, the output should be 6.




package assignment1;

import java.util.Scanner;

public class q6 {
	
	
	public static void sum_of_digits(int num)
	{
		int sum =0;
		while(num > 0)
		{
			sum = sum + (num % 10);
			num = num/10;		
		}
		System.out.println("The sum of digits are: "+ sum);
			
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		sum_of_digits(number);
		s.close();
		
		
	}

}


