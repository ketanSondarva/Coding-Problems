import java.util.HashSet;

public class ContainsDuplicate {
        public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<Integer>();

        int count = 0;
        for(int i = 0; i < nums.length; i++) {

            if(!(set.contains(nums[i])))
                set.add(nums[i]);
            else
                set.remove(nums[i]); 
               
        }

        System.out.println(set.size());
        return k == set.size();

    }

    public static void main(String[] args) {
        
        int arr[] = {1,0,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        int a[] = {1,2,3,1,2};

        System.out.println(containsNearbyDuplicate(a, 3));


    }
}
