package Math_Formula;

/*

1512. Number of Good Pairs

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0 

*/

import java.util.HashMap;

public class CountPairArray {

    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> counter = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(counter.containsKey(nums[i])) counter.put(nums[i], counter.get(nums[i])+1);
            else counter.put(nums[i], 1);
        }
        
        System.out.println(counter);
        int count = 0;

        for(Integer n:counter.values()) 
            if(n > 1) count += (n * (n-1) / 2);

        return count;
        
        // how its work:
        // Count how many times each number appears. If a number appears n times, then n * (n – 1) / 2 good pairs can be made with this number.

        // for ex: [1,1,1,3,4,6,1]:
        // number of 1 in above example is 4.
        // then possible pair is 4*3/2 => 6.

        // so that we just need to count how many times particular no. appear.
        
    }
}

