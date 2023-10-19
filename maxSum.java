
// Failed.

public class maxSum {
    public int solution(int[] nums) {
        
        int max = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                sum = nums[i]+nums[j];

                if(paired(sum)) {
                    if(sum > max) 
                        max = sum;

                        System.out.println(max);
                }
                    
            }
        }

        return max;
    }

    public boolean paired(int sum) {

        int x = sum%10;

        while(sum != 0) {
            if(sum%10 != x)
                return false;

            sum/=10;
        }

        return true;

    }

    public static void main(String[] args) {
        int[] nums = {51,71,17,24,42};

        maxSum m = new maxSum();

        int sol = m.solution(nums);

        System.out.println(sol);
    }
}
