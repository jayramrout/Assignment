package _03_Control_Statement_Arrays.loops;

public class MultipleVariables {

	public static void main(String[] args) {
		for(int i=0, j=1, k=2 ; i<5 ; i++)
		       System.out.println("I : " + i + ",j : "+ j++ + ", k : " + k++);
	}
}