

public class FibFormula implements FindFib{
    public int calculate_fib(int n) {
        int numerator = (int) (Math.pow((1 + Math.sqrt(5)), n) - Math.pow((1 - Math.sqrt(5)), n));
        int denominator = (int) (Math.pow(2, n) * Math.sqrt(5));
        return numerator / denominator;
    }
}
