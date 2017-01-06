package corejava.forloop;

import java.util.Scanner;
/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the 
 * same backward or forward, such as madam or kayak.
 * @author jrout
 *https://en.wikipedia.org/wiki/Palindrome
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Number");
		int number = scan.nextInt();
		
		boolean isPalindrome = false;
		
		// Your logic goes here...to set the boolean value
		// Use for loop.
		if(isPalindrome){
			System.out.println(number+" is Palindrom");
		}else{
			System.out.println(number+" is not a Palindrom number ");
		}

	}

}
// 161 is a palindrome number