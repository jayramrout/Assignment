package _03_Control_Statement;

import java.util.Scanner;

/**
 * Check if a person can donate blood or not.
 */
public class Program_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();

        System.out.println("Enter weight");
        int weight = scanner.nextInt();

        /*
            if age>=18
                weight>50
                    "You are eligible to donate blood"
                "You are not eligible to donate blood"
            else
                "Age must be greater than 18"
         */
    }
}
/*
    input : 16
    output
        Age must be greater than 18

    input : age = 20 and weight = 45
    output:
          You are not eligible to donate blood
 */