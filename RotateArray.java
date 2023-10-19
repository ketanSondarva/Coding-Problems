import java.util.Arrays;

public class RotateArray {
   
        public static void rotate(int[] nums, int k) {
            k %= nums.length;

            System.out.println(k);

            int n = nums.length;
            reverseNum(nums,0,n-1);
            System.out.println(Arrays.toString(nums));
            reverseNum(nums,0,k-1);
            System.out.println(Arrays.toString(nums));
            reverseNum(nums,k,n-1);
            System.out.println(Arrays.toString(nums));
        }
        public static void reverseNum(int[] nums, int start, int end) {
            while(start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    
        public static void main(String[] args) {
            
            int nums[] = {1,2,4,5};

            rotate(nums,6);

            System.out.println(17%4);

            // suppose: for rotate 1 times: 54321 = reverse of an array.
            // 2nd time: 12345: 51234: 54123
            // 3rd time: ....
            // 4th time: it will give the same array as input: 1234, because array.length = k

            // 5th time = 1st time (rotation by 1)
            // 6th time = 2nd time (rotaion by 2)

            // hence the rotation will needed for k % array.length times
            // suppose to rotate 17 times we actually need to rotate 17 % 4(length of array) = 1 time only !!
            // that is the magic !!!
            // an unfair advantage !!!

        }
}
