package _01_Variables_Datatypes;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Use scanner to take input dynamically.
 */
public class CheckEvenOdd {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Enter an Integer number:");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        boolean isOdd = num % 2 != 0; // use the module operator to check if a number is odd or even.(Google it)
        System.out.println("The number entered " + num + " is Odd ? " + isOdd);
    }
}
