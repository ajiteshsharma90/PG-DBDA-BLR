// 5) Find the Largest Number: Write a program that takes three integers as input and 
//    determines the largest number among them using conditional statements.



package assignment1;

import java.util.Scanner;

public class q5 {
	
	public static void largest_num(int num1, int num2, int num3)
	{
		if (num1 > num2 && num1 > num3)
			System.out.println("The largest Number is " + num1);
		else if (num2> num3 && num2 > num1)
			System.out.println("The largest Number is " + num2);
		else
			System.out.println("The largest Number is " + num3);
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the FIRST number: ");
		int num1 = s.nextInt();
		System.out.println(" Enter the SECOND number: ");
		int num2 = s.nextInt();
		System.out.println(" Enter the THIRD number: ");
		int num3 = s.nextInt();
		largest_num(num1, num2, num3);
		s.close();
	}

}
