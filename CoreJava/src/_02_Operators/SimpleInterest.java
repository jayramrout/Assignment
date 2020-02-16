package _02_Operators;

import java.util.Scanner;

/**
 * Simple Interest Formula
 *
 * Simple Interest = (P × R × T)/100
 *
 * P is Principal amount.
 * R is rate per annum.
 * T is time in years.
 */
public class SimpleInterest {
    public static void main(String[] args) {
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();

        sinterest = 0 ; // calculate the simple interest here..
        System.out.print("Simple Interest is: " +sinterest);
    }
}
