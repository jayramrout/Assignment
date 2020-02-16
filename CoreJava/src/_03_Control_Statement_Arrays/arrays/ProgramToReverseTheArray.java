package _03_Control_Statement_Arrays.arrays;

import java.util.Scanner;

/**
 * This program reverse the array. For example if user enters the array
 * elements as 1, 2, 3, 4, 5 then the program would reverse the array and the
 * elements of array would be 5, 4, 3, 2, 1.
 */
public class ProgramToReverseTheArray {
    public static void main(String[] args) {
        int counter, i=0, j=0, temp;
        int number[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements you want to enter: ");
        counter = scanner.nextInt();

        /* This loop stores all the elements that we enter in an
         * the array number. First element is at number[0], second at
         * number[1] and so on
         */
        for(i=0; i<counter; i++)
        {
            System.out.print("Enter Array Element"+(i+1)+": ");
            number[i] = scanner.nextInt();
        }

        /*
            First print all the values.
            Write the program to reverse it
         */
    }
}
