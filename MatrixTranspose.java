public class MatrixTranspose {

    // 1 2 3 
    // 4 5 6
    // 7 8 9

    // after transpose (convert row into the column):

    // 1 4 7 
    // 2 5 8 
    // 3 6 9 

    public static void transpose(int matrix[][]) {

        // 1: using the extra space:
/* 
        int n = matrix.length;
        int result[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        System.out.println("result of the transpose operation: ");
        
        printMatrix(result);
         */


        // 2. In-place transpose: (no need to declare the onother matrix only swap operation):

        // ignore the first diagonal and exchange other row's elements with respect to the corresponding column elements:
        // try using bool and pen:
        
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // int start = 0;
        // int end = matrix.length-1;

        // while(start < end) {

        // }

        printMatrix(matrix);
    }

    public static void printMatrix(int matrix[][]) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        } 

    }

    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

        transpose(matrix);

    }
}
