package _03_Control_Statement_Arrays;

import java.util.Scanner;

/**
 * take input from command line and determine of the character is a vowel or constant
 *
 * write the program using if else statement
 * write the program using switch statement also.
 */
public class Program_05_Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = scanner.next().charAt(0);

        System.out.println(character);

        /*
        HINT: convert the character to a int  which will give you the ascii value of a character.
                google the ascii value of all the characters..
         */
    }
}