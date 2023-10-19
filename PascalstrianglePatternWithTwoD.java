public class PascalstrianglePatternWithTwoD {
    
    public static void main(String[] args) {
        
        int n = 5;

        int line[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            // Every line has number of integers 
            // equal to line number
            for(int j = 0; j <= i; j++) {

                if(j == 0 || j == i)    // firslt and last element will always 1.
                    line[i][j] = 1;
                else { 
                    // add the value of the left element and direct above the element.
                    line[i][j] = line[i-1][j-1] + line[i-1][j];
                }
                System.out.print(line[i][j]);
            }

            System.out.println();
        }

       /* in first 2 iterations:

         1
         1 1

        */

        // after first two iterations: 
        // 1.keep first and last element as 1
        // 2.for middle elements: sum the value of left: line[i-1][j-1] + direct above: line[i-1][j]

    }
}
