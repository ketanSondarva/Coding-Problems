package Imp_Basics;

public class FindSecondMax {

    // your solution of leetcode question, learn: finding first and second max without sorting
    public static int maxProduct(int[] nums) {
        // find the max and second max:

        int firstMax = 0;
        int secondMax = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] >= secondMax) {
                firstMax = secondMax;
                secondMax = nums[i];
                continue;  // or you can use 'else if' statement 
            }
            if(nums[i] != secondMax && nums[i] > firstMax) {
                firstMax = nums[i];
            }
        }

        System.out.println("first max = "+firstMax+" second max = "+secondMax);

        return (firstMax-1) * (secondMax-1);

    }

    public static void main(String[] args) {
        int[] arr = {10,5,2,5};
        System.out.println(maxProduct(arr));
    }
}
