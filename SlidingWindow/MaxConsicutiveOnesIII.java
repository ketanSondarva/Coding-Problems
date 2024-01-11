package SlidingWindow;

public class MaxConsicutiveOnesIII {

    static int maxConsicutiveOnes(int arr[], int k) {

        int start = 0;
        int end = 0; 
        int zeros = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)
                zeros++;
            end++;
            if(zeros > k) {
                if(arr[start] == 0)
                    zeros--;
                start++;
            }

        }

        return end - start;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(maxConsicutiveOnes(arr, 2));
    }
}
