package SlidingWindow;

public class MaxConsicutiveOne {

    // {0,1,1,1,0,0,0,1,1,1,1,1,1,0,0,0,1,1}

    static int maxConsicutiveOnes(int arr[]) {
        int count = 0;
        int max = 0;

        for(int i : arr) {
            if(i == 1) {
                count++;
            }
            else {
                count = 0;
            }
            max = Math.max(max, count);
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,0,0,0,1,1,1,1,1,1,0,0,0,1,1};
        System.out.println(maxConsicutiveOnes(arr));
    }
}
