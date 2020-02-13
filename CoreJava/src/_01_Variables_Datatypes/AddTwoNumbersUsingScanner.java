package _01_Variables_Datatypes;

import java.util.Scanner;

/**
 * Display the output.
 */
public class AddTwoNumbersUsingScanner {
    public static void main(String[] args) {

        int num1, num2, sum;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First Number: ");
//        num1 = sc.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a : \n");
        num1 = scanner.nextInt();
        System.out.println("Please enter b : \n");
        num2 = scanner.nextInt();
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // System.out.println("Enter Second Number: ");
        // use the same code in line#15 and store the value in num2

        sum = num1 + num2; // uncomment this after completing the code in line#18
        System.out.println("Sum of these numbers: " + sum); // Uncomment this.
    }
}
