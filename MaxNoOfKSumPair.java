import java.util.HashMap;

public class MaxNoOfKSumPair {

    public static int maxOperations(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        System.out.println(map);

        int oprationCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(k-nums[i])) {

                
                int index = map.get(k-nums[i]);
                nums[index] = 0;
                // System.out.println(index);
                // System.out.println(map.get(k-nums[i]));
                oprationCount++;
                nums[i] = 0;

            }
        }
        
        return oprationCount;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,3,4,3};

        System.out.println("total operation: ");
        System.out.println(maxOperations(arr, 6));
    }
}
