// 1) Even or Odd Checker: Write a program that takes an integer input from the user and determines if the number is even or odd.
//     Print the result.


package assignment1;

import java.util.Scanner;

public class q1 {
	
	
	public static void odd_even(int num) 
	{
		if (num%2 == 0)
			System.out.println("Given Number is Even");
		else
			System.out.println("Number is odd");
		
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = s.nextInt();
		odd_even(num);
		s.close();

	}

}
