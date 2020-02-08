package _03_Control_Statement;

import java.util.Scanner;

/**
 * take the month number using command line ,
 * then using the switch statement print the actual Month name.
 * if an invalid month is entered, then print "Invalid number"
 */
public class Program_04_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month");
        int month = scanner.nextInt();
        String monthString = "";

        switch(month){
            // Write all your code in this block of code.
        }
        System.out.println(monthString);
    }
}
