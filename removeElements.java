class Solution {
    public static int removeElement(int[] nums, int val) {

        // int count = 0;

        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i] != val)
        //         count++;
        // }

        int expectedNums[] = new int[nums.length];

        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                expectedNums[j] = nums[i];
                j++;
            }
        }

        int k = j;
        print(expectedNums);
        // System.out.println(j);

        while(j < nums.length) {
            expectedNums[j] = '_';
            j++;
        }

        System.out.println();
        print(expectedNums);
        // return count;

        return k;
        
    }

    public static void print(int nums[]) {
        for(int i:nums)
            System.out.print(i+" ");
    }

    public static void main(String[] args) {
        
        int nums[] = {3,2,2,3,0,1,2,3,4};

        int i = removeElement(nums, 3);
        System.out.println(i);
    }

}