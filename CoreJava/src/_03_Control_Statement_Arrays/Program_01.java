package _03_Control_Statement_Arrays;

import java.util.Scanner;

/**
 * Determine the grade of the student based on the mark
 */
public class Program_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark");
        int marks = scanner.nextInt();

        /*
            marks<50 --> Fail
            marks>=50 && marks<60 --> D Grade
            marks>=60 && marks<70 --> C Grade
            marks>=70 && marks<80 --> B Grade
            marks>=80 && marks<90 --> A Grade
            marks>=90 && marks<100 --> A+ Grade
            if the number does not fall between 0 to 100 , it should print invalid.
         */

    }
}
