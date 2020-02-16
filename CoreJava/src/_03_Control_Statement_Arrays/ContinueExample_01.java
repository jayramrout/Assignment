package _03_Control_Statement_Arrays;

public class ContinueExample_01 {
    public static void main(String[] args) {
        int n = 1;
        do {
            // if n equals 5 then continue..
            System.out.println("n = " + n);
            n++;
        } while( n < 10 );
    }
}
