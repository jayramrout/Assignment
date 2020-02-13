package _03_Control_Statement;

import java.util.Scanner;

/**
 * take input from command line and determine of the character is a vowel or constant
 * <p>
 * write the program using if else statement
 * write the program using switch statement also.
 */
public class Program_05_Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = scanner.next().charAt(0);

        System.out.println(character);
        int i = (int) character;

        if (i == 65 || i == 97 //Aa
                || i == 69 || i == 101 //Ee
                || i == 73 || i == 105 //Ii
                || i == 79 || i == 111  //Oo
                || i == 85 || i == 117 //Uu
        ) {
            System.out.println("This character is vowel");
        } else {
            System.out.println("This character is consonant");
        }

        switch (i) {
            case 65:
            case 69:
            case 73:
            case 79:
            case 85:
            case 97:
            case 101:
            case 105:
            case 111:
            case 117:
                System.out.println("This character is vowel");
                break;
            default:
                System.out.println("This character is consonant");
                break;
        }
        /*
        HINT: convert the character to a int  which will give you the ascii value of a character.
                google the ascii value of all the characters..
         */
    }
}