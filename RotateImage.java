import java.util.Arrays;

public class RotateImage {
    
    // rotate matrix 90 degree:
        public static void rotate(int[][] matrix) {
            
            int curr = matrix.length-1;
            System.out.println(curr);
            
            for(int i = 0; i < matrix.length; i++) {
                
                curr = matrix.length-1-i;

                System.out.println("curr: "+curr);
                
                for(int j = matrix.length-1; j >= 0; j--) {
                    
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[curr][j];
                    matrix[curr][j] = temp;
                    
                }
            }

            System.out.println(Arrays.toString(matrix));
        }

        public static void main(String[] args) {
            int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

            rotate(arr);
        }
    
}
