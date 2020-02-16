package _02_Operators;

/**
 * Java Program to Calculate Compound Interest
 *
 * Let’s say an amount of $2,000 is deposited into a bank account as a fixed deposit at an annual interest rate of 8%, compounded monthly, the compound interest after 5 years would be:
 *
 * P = 2000.
 * R = 8/100 = 0.08 (decimal).
 * n = 12.
 * t = 5.
 *
 * Let’s put these values in the formula.
 *
 * Compound Interest = 2000 (1 + 0.08 / 12) (12 * 5) – 2000 = $979.69
 *
 * So, the compound interest after 5 years is $979.69.
 *
 */
public class CompoundInterest {

    public static void main(String[] args) {
        calculate(2000, 5, .08, 12);
    }

    /**
     * Write logic to calculate the compound interest.
     * @param p
     * @param t
     * @param r
     * @param n
     */
    public static void calculate(int p, int t, double r, int n) {

    }
}
