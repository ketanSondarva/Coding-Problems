package Dynamic_Programming;

import java.util.Arrays;

public class MinClimbingCost {

    // solution 1: recursion method:
    static int recursive(int[] cost, int n) {

        // base condition:
        if(n == 1 || n == 0)
            return cost[n];

        int ans = cost[n] + Math.min(recursive(cost, n-1), recursive(cost, n-2));
        return ans;
    }

    // solutoin 2: using memoisation method:
    static int memoisation(int[] cost, int[] dp, int n) {
        // base condition:
        if(n == 1 || n == 0)
            return cost[n];

        if(dp[n] != -1)
            return dp[n];

        dp[n] = cost[n] + Math.min(memoisation(cost, dp, n-1), memoisation(cost, dp, n-2));
        return dp[n];

    }


    // solution 3: using tabulation method:
    static int tabulation(int[] cost, int n) {

        int[] dp = new int[n];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[n-1], dp[n-2]);

    }

    // solution 3: using constant space:

    // special test case: cost = [10,15,20] ans:15
    static int constandSpace(int[] cost, int n) {

        int prev1 = cost[1];
        int prev2 = cost[0];

        int minCost = 0;
        for(int i = 2; i < n; i++) {
            minCost = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = minCost;
        }

        return minCost;
    }

    public static void main(String[] args) {

        int[] cost = {10,35,5,2,54,2,3};
        int n = cost.length;
        // int ans = Math.min(recursive(cost, n-1), recursive(cost, n-2));

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        // int ans = memoisation(cost, dp, n);
        int ans = Math.min(memoisation(cost, dp, n-1), memoisation(cost, dp, n-2));
        System.out.println(ans);


        int answer = tabulation(cost, cost.length);
        System.out.println("using tabulation: "+answer);

        // some special test case may not work: for learning purpose:
        int answer2 = constandSpace(cost, cost.length);
        System.out.println("using constant space solution: "+answer2);

    }
}
