// 3) Temperature Converter: Develop a program that converts temperature from Celsius to Fahrenheit. 
//    The formula is F = C * 9/5 + 32. Take user input for Celsius and display the result in Fahrenheit.


package assignment1;

import java.util.Scanner;

public class q3 {
	
	public static void temp_converter (float temp) 
	{
		float new_temp = (temp * 9/5) + 32;
		System.out.println("Temperature in Fahrenheit is "+ new_temp +" F");
		
		
		
		
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Temperature in C: ");
		float temp = s.nextFloat();
		temp_converter(temp);
		s.close();

	}

}
