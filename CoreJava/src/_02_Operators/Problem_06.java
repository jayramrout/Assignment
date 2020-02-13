package _02_Operators;

import java.util.Scanner;

/**
 * Using ternary Operator check which number is maximum and print it.
 */
public class Problem_06 {
	public static void main(String[] args) {
		int a=0; // Use scanner to take the input for a
		int b=0; // Use scanner to take input for b

		System.out.println("Please enter two numbers ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();

		int max = Math.max(a, b); // use the logic here to assign the max value using ternary operator
		System.out.println("Max of both number is "+ max);

		int min = Math.min(a, b); // use the logic here to assign the max value using ternary operator
		System.out.println("Min of both number is "+ min);

	}

}