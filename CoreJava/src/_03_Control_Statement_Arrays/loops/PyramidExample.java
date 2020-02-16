package _03_Control_Statement_Arrays.loops;

import java.util.Scanner;

public class PyramidExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the pyramid Number");
		int rows = scan.nextInt();
		System.out.println("Enter diff. between two numbers");
		int diff = scan.nextInt();

		int y = 0;

		for (int i = 0; i <= rows; i++) {

			// First Try solving it yourself... Solution is at the bottom..
			// Code goes here...STARTS			
			// Code goes here...ENDS
			System.out.println("");
		}

	}

}
/**
 * 
Enter the pyramid Number 
6
Enter diff. between two numbers 
4

0	
4	8	
12	16	20	
24	28	32	36	
40	44	48	52	56	
60	64	68	72	76	80

*/



/*for (int j = 1; j <= i; j++) {
System.out.print(y + "\t");
y = y + diff;
}*/