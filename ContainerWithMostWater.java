public class ContainerWithMostWater {

    public static int containerWithMostWater(int[] arr) {

        int start = 0;
        int stop = arr.length - 1;

        int max = 0;
        while(start < stop) {
            int min = Math.min(arr[start], arr[stop]);
            int result = min * (stop - start);
            max = Math.max(max, result);

            if(arr[start] < arr[stop]) 
                start++;
            else
                stop--;
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        System.out.println(containerWithMostWater(arr));
    }
}
