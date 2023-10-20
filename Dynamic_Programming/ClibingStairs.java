package Dynamic_Programming;

public class ClibingStairs {
        public int climbStairs(int n) {
            
            // for memoisation method:
            // int dp[] = new int[n+1];
            // Arrays.fill(dp, -1);
            // return memoisationCountStairs(n, 0, dp);
            
                
            // return recursiveCountStairs(n, 0);
            
            return tabulation(n);
    
        }
        
        
        // recursive demo:
    //     public int recursiveCountStairs(int n, int i) {
            
    //         // base case:
    //         if(i == n)
    //             return 1;
    //         if(i > n)
    //             return 0;
            
    //         return (recursiveCountStairs(n, i+1) + recursiveCountStairs(n, i+2));
    //     }
        
    //         public int memoisationCountStairs(int n, int i, int dp[]) {
            
    //             // base case:
    //             if(i == n)
    //                 return 1;
    //             if(i > n)
    //                 return 0;
    
    //             // if solution is already available:
    //             if(dp[i] != -1)
    //                 return dp[i];
                
    //             dp[i] = (memoisationCountStairs(n, i+1, dp) + memoisationCountStairs(n, i+2, dp));
    //             return dp[i];
    
    //         }
        
            public int tabulation(int n) {
                
                if(n <= 2) return n;
                
                int dp[] = new int[n+1];
                
                dp[0] = 1;
                dp[1] = 2;
                
                for(int i = 2; i <= n; i++) {
                    dp[i] = dp[i-1] + dp[i-2];
                }
                
                return dp[n-1];
            }
        
            public static void main(String[] args) {
                ClibingStairs cs = new ClibingStairs();
                System.out.println(cs.climbStairs(45));
            }
}
