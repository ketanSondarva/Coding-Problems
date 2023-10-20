package Dynamic_Programming.Fibonacci;

// printing nth fibonacci number using - Tabulation method of dynamic programming:
public class Tabulation {

    static int fibo(int n) {
        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        int i = 0;
        for(i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(fibo(9));
    }
}
