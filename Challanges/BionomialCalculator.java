import java.math.*;

public class BionomialCalculator {

    // For Factorials
    public static int factorial(int number) {
        int factorialvalue = 1;
        for (int i = number; i > 1; i--) {
            factorialvalue *= i;
        }
        return factorialvalue;
    }

    // For Permutation
    public static int permutation(int number1, int number2) {

        if (number1 < number2 || number1 < 0 || number2 < 0) {
            System.out.println("INVALID INPUT : Numbers must be non-negative integers and num1 >= num2\" ");
            return -1;
        } else {
            return factorial(number1) / factorial(number1 - number2);
        }
    }

    // For Combination
    public static int combination(int number1, int number2) {

        int numerator = factorial(number1);
        int denominator = factorial(number2) * factorial(number1 - number2);

        if (number1 < number2 || number1 < 0 || number2 < 0) {
            System.out.println("INVALID INPUT : Numbers must be non-negative integers and num1 >= num2\" ");
            return -1;
        } else {
            return numerator / denominator;
        }

    }

    // For Bionomial Theorem
    public static float bionomialProbability(float p, float q, int r, int n) {

        float comb = combination(n, r);
        float bionomialvalue = (float) (comb * Math.pow(p, r) * Math.pow(q, n - r));
        return bionomialvalue;

    }

    public static void main(String[] args) {
        // System.out.println("-".repeat(32));
        // System.out.println("Factorial   : " + factorial(12));
        // System.out.println("Permutation : " + permutation(12, 4));
        // System.out.println("Combination : " + combination(12, 3));
        // System.out.println("Bionomial Probability : " + bionomialProbability((float) .5, (float) .5, 2, 4));


    }
}