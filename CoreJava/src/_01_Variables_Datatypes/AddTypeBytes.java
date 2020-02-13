package _01_Variables_Datatypes;

/**
 * Add the below bytes and print the  output.
 * hint: you have to use casting to byte.
 */
public class AddTypeBytes {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;

        byte c = (byte) (a + b); // This will give compile time error. Correct it.
        System.out.println("Sum of " + a + " and " + b + " is " + c);

    }
}
