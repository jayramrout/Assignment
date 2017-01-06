package corejava.forloop;

import java.util.Scanner;
/**
 * In mathematics, the Fibonacci numbers are the numbers in the following integer sequence, 
 * called the Fibonacci sequence, and characterized by the fact that every number after the 
 * first two is the sum of the two preceding ones:[1][2]
 * 
 * eg : 0 1 1 2 3 5 8 13 21 34
 * 	2 is sum of previous 1 + 1
 *  3 is sum of previous 1 + 2 like wise...
 * 
 * @author jrout
 *
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Limit for Fibonacci Series: \n");
		int limit  = scan.nextInt();
		
		long[] series = new long[limit];
		//create first 2 series elements
        series[0] = 0;
        series[1] = 1;
        
		for(int i=2; i < limit; i++){
			// Your Logic goes here to construct the fibonacci series...
			 // series[i] = Take the sum of previous two array index...
		}
		
		System.out.println("Fibonacci Series upto " + limit);
        for(int i=0; i< limit; i++){
                System.out.print(series[i] + " ");
        }
	}

}

/**
 * Fibonacci Series upto 5
	0 1 1 2 3 
*/
