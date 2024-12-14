//2) Grade Calculator: Create a program that accepts a student's score (0-100) and assigns a grade based on the following criteria:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: Below 60 Print the grade.



package assignment1;

import java.util.Scanner;

public class q2 {

	public static void grade_calc(int score) 
	{
		if (score >= 90 && score < 100)
			System.out.println("Grade is A");
		else if (score >= 80 && score < 90)
			System.out.println("Grade is B");
		else if (score >= 70 && score < 80 )
			System.out.println("Grade is C");
		else if (score >= 60 && score < 70)
			System.out.println("Grade is D");
		else if (score < 60 && score >= 0 )
			System.out.println("Grade is F");
		else
			System.out.println("Enter Valid Score");
		
		
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Score");
		int score = s.nextInt();
		grade_calc(score);
		s.close();

	}

}
