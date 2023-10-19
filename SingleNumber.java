import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {
       public Integer singleNumber(int[] nums) {

        // Solution 1: using hashset:

        // HashSet<Integer> hs = new HashSet<Integer>();
        // for(int i=0; i<nums.length; i++) {
        //     if(!hs.contains(nums[i])) 
        //         hs.add(nums[i]);
        //     else
        //         hs.remove(nums[i]);
        // }

        // Iterator itr = hs.iterator();
        // // System.out.println(itr.next());

        // return Integer.parseInt(itr.next().toString());



        // solution2: using bit manipulation:

        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            System.out.println(ans);
            ans^=nums[i];
        }
     
        return ans;
        
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();

        int[] nums = {4,1,2,1,2};
        int sol = sn.singleNumber(nums);


        System.out.println(sol);
    }
}
