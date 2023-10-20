package Dynamic_Programming.Fibonacci;

import java.util.Arrays;

// printing nth fibonacci number using - Memoisation method of dynamic programming:
public class Memoisation {

    static int fibo(int n, int dp[]) {
        if(n == 1 || n == 0)
            return n;
        
        if(dp[n] != -1) return dp[n];

        dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
        return dp[n];
    }

    public static void main(String[] args) {

        int n = 9;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibo(n, dp));

    }
}
