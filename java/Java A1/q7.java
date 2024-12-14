// 7) Multiplication Table: Write a program that generates and prints the multiplication table for a number entered by the user (1 to 10).

package assignment1;

import java.util.Scanner;

public class q7 
{
	public static void multiplication_table(int number) 
	{	
		System.out.println("Multiplication Table:");
		for (int i = 1; i <= 10; i++) 
		{
			int mult_num = i * number;
			
			System.out.println(number+" x "+ i+" = "+ mult_num);
		}
		
	}

	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = s.nextInt();
		multiplication_table(number);
		s.close();
		
	}

	
}
