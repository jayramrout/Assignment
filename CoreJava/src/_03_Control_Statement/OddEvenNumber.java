package _03_Control_Statement;

import java.util.Scanner;

/**
 * Find if the number is odd or even
 */
public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value : \n");
        int input  = scan.nextInt();

        if(input % 2 != 0) {
            System.out.println("The Number " + input + " is odd number");
        } else {
            System.out.println("The Number " + input + " is even number");
        }
        // Take input from command line
        // use if condition to check if its odd, then print, "The Number is odd <number>"
        // else "The Number is even<number>"
    }
}
