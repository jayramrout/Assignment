package _02_Operators;/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
*/
import java.util.Scanner;

public class Problem_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final double METERS_PER_FOOT = 0.305;

		// Prompt user to enter a number in feet
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();

		// Convert feet into meters
		double meters = 0 ; // TODO : Add the logic here.

		// Display results
		System.out.println(feet + " feet is " + meters + " meters");
	}
}