import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        System.out.println(m+" "+n);

        int j=0;
        for(int i=n-m; i<n; i++) {
            nums1[i] = nums2[j];
            j++;
        }

        for(int i:nums1)
            System.out.print(i+" ");

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }

    public static void main(String[] args) {
        
        MergeSortedArray ms = new MergeSortedArray();

        int nums1[] = {1,2,3,0,0,0,0,0};
        int nums2[] = {2,5,6,2,4};

        ms.merge(nums1, nums2.length, nums2, nums1.length);
    }
}
