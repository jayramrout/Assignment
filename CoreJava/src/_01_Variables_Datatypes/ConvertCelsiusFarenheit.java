package _01_Variables_Datatypes;

import java.util.Scanner;

public class ConvertCelsiusFarenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to input a double
        System.out.print("Enter a value  in Celsius: ");
        double celsius = input.nextDouble();
        // write the program to convert from Celsius to Fahrenheit
        // print the out put here.
        double fahrenheit = 32 + celsius * 1.8;
        System.out.print("Fahrenheit degree of " + celsius + "is: " + fahrenheit);

    }
}
