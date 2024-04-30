public class FibIteration implements FindFib {
    public int calculate_fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 1;
        int ans = 0;

        for (int i = 3; i <= n; i++) {
            ans = prev1 + prev2;
            prev1 = prev2;
            prev2 = ans;
        }

        return ans;
    }
}
