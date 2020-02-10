package _03_Control_Statement;

import java.util.Scanner;

public class BreakExample_01 {
    public static void main(String[] args) {
        int x;
        Scanner s = new Scanner(System.in);

        for(;;){
            System.out.println("Enter 0 to stop");
            x = s.nextInt();
            // check the value of x if x is zero then break out of it.
        }
    }
}
