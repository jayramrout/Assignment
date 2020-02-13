package _01_Variables_Datatypes.assignment01;

import java.util.Scanner;

/**
 * Solve (a + b) whole square = a square + b square + 2ab
 * Solve (4a + 5b)2
 *
 * Take the input from command prompt.
 */
public class Problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a : \n");
        int a = scanner.nextInt();
        System.out.println("Please enter b : \n");
        int b = scanner.nextInt();
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        System.out.println("(a + b) whole square =" + (Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b));
        System.out.println("(4a + 5b) whole square =" + (Math.pow(4 * a, 2) + Math.pow(5 * b, 2) + 2 * 4 * a * 5 * b));
    }
}
