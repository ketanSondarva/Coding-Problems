

// NOTE: LEARNING PURPOSE ONLY --> use 2D ARRAY method to solve this problem.

// 2D Array: wasting of space
// nCr: wating of time : resolving 3 factorial(recursive function) in each iteration.

public class PascalsTrianglePatternUsingNCR {
    

/*           1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1          */

// nCr formula: n!/(n-r)!r!

// after the use of nCr formula with each elements:

/*         0C0
        1C0   1C1
     2C0   2C1   2C2
  3C0   3C1   3C2   3C3     */


   public static int factorial(int n) {
        if(n == 0)
            return 1;

        return n*factorial(n-1);
   }
    public static void main(String[] args) {
        
        int n = 5;
        for(int i = 0; i < n; i++) {

            // This loop is for putting left space only, to give it pyramid/triangular shape:
            for(int j=0; j<=n-i; j++) {
                System.out.print(" ");
            }

            // This loop is for counting nCr:
            for(int j = 0; j <= i; j++) {
                // implementation of:   n!/(n-r)!r!
                System.out.print(factorial(i)/((factorial(i-j)*factorial(j)))+" ");
            }
            System.out.println();
        }

    }
}
