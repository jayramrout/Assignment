package _03_Control_Statement_Arrays;

import java.util.Scanner;
/*
Determine If Year Is Leap Year Java Example
This Determine If Year Is Leap Year Java Example shows how to
determine whether the given year is leap year or not.
*/
public class DetermineLeapYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year: \n");
		int year  = scan.nextInt();
		
		boolean isLeapYear = false; // Your Logic should go here.
		if(isLeapYear)
			 System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is a not leap year");
	}

}

/*
Output of the example would be if entered 2004
	Year 2004 is a leap year
*/
