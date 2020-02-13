package _03_Control_Statement;

import java.util.Scanner;

/**
 * Check +ve , -ve or ZERO
 */
public class Program_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark");
        int marks = scanner.nextInt();

        if(marks > 0) {
            System.out.println("+ve");
        } else if(marks < 0) {
            System.out.println("-ve");
        } else {
            System.out.println("ZERO");
        }
        /*
            number>0 --> +ve
            number<0 --> -ve
            else print number is ZERO
         */

    }
}
