import java.util.Arrays;
import java.util.HashMap;

public class NextGreaterElement {
        public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[nums1.length];

        for(int i = 0; i < nums2.length; i++)
            map.put(nums2[i], i);

        System.out.println(map);
        
        // take the elements of nums1 and find its index from nums2 as : nums1 is subset of nums2:
        for(int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater(map.get(nums1[i]), nums2);
            System.out.println(result[i]);
            System.out.println(nums1[i]+"-->"+map.get(nums1[i]));
        }

        return result;
    }

    public static int nextGreater(int index, int[] nums) {

        System.out.println("index = "+index);
        for(int i = index; i < nums.length-1; i++) {
            System.out.println(nums[i]+" "+nums[i+1]);
            if(nums[i] < nums[i+1]) 
                return nums[i+1];
        }

        return -1;
    }

    public static void main(String[] args) {

        int nums1[] = {4,1,2};
        int nums2[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
