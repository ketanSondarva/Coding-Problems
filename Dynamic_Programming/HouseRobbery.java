package Dynamic_Programming;

// adjecent house must not be selected
// important notes:
    // this problem is given in code studio,
    // it is not given as in leet code
    // in this question we can't rob first and last house, those are adjecent.


public class HouseRobbery {

    static int solution(int[] nums) {
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

        return prev1;
    }

    static int houseRobber(int nums[]) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int[] first = new int[n];
        int[] second = new int[n];

        for(int i = 0; i < n; i++) {
            if(i != n-1) first[i] = nums[i];
            if(i != 0) second[i] = nums[i];
        }

        return Math.max(solution(first), solution(second));
    }

    public static void main(String[] args) {
        
        int[] house = {9,8,7};    // output: 9    
        int ans = houseRobber(house);
        System.out.println(ans);

    }
}
