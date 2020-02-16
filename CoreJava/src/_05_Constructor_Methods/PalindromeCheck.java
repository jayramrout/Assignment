package _05_Constructor_Methods;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        //For capturing user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        /* If function returns true then the string is
         * palindrome else not
         */
        if(isPal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }

    /**
     * Write logic to find if the string is palindrome
     * @param string
     * @return
     */
    private static boolean isPal(String string) {
        return false;
    }
}
