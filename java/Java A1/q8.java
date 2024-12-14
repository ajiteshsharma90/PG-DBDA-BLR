// 8) Leap Year Checker: Develop a program that checks if a given year (input by the user) is a leap year. 
//    A year is a leap year if it is divisible by 4, but not divisible by 100, unless it is also divisible by 400.


package assignment1;

import java.util.Scanner;

public class q8 
{
	
	public static void leap_year(int year) 
	{
		if ((year%4 == 0 && year%100 !=0) || year%400 ==0) 
		  System.out.println(year + " is a leap year" );
		else 
			System.out.println(year + " is not leap year" );
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = s.nextInt();
		leap_year(year);
		s.close();
		
		
	}
}
