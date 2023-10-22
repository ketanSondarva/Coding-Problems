package Dynamic_Programming;

import java.util.Arrays;

// four solutions of one problem: recursive, memoisation, tabulation, space optimized: O(1) space
// -----
// =====>
public class MaximumNonAjdcentSum {

    static int recursiveSolution(int[] nums, int n) {

        // base conditoin:
        if(n < 0) return 0;
        if(n == 0) return nums[0];

        int incl = recursiveSolution(nums, n-2) + nums[n];
        int excl = recursiveSolution(nums, n-1) + 0;

        return Math.max(incl, excl);
    }

    static int memoisation(int[] nums, int[] dp, int n) {
        // base condition:
        if(n < 0) return 0;
        if(n == 0) return nums[0];

        // if element is already available:
        if(dp[n] != -1) return dp[n];

        int incl = memoisation(nums, dp, n-2) + nums[n];
        int excl = memoisation(nums, dp, n-1) + 0;

        dp[n] = Math.max(incl, excl);

        return dp[n];
    }

    static int tabulation(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = nums[1];

        for(int i = 2; i < nums.length; i++) {
            int incl = dp[i-2] + nums[i];
            int excl = dp[i-1] + 0;
            dp[i] = Math.max(incl, excl);
        }

        return dp[nums.length-1];
    }

    static int spaceOptimized(int[] nums) {
        int prev2 = nums[0];
        int prev1 = nums[1];

        int ans = 0;
        for(int i = 2; i < nums.length; i++) {
            int incl = prev2 + nums[i];
            int excl = prev1 + 0;

            ans = Math.max(incl, excl);

            prev2 = prev1;
            prev1 = ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {9,9,8,2};

        int ans = recursiveSolution(arr, arr.length-1);
        System.out.println(ans);

        int[] dp = new int[arr.length+1];
        Arrays.fill(dp, -1);
        ans = memoisation(arr, dp, arr.length-1);
        System.out.println(ans);

        ans = tabulation(arr);
        System.out.println(ans);

        ans = spaceOptimized(arr);
        System.out.println(ans);
    }
}
