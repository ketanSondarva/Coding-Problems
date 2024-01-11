// LeetCode 1137

// The Tribonacci sequence Tn is defined as follows: 
// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

public class Nth_Tribonacci_Number {

    static int fibo(int n) {

        if(n == 1 || n == 2)
            return 1;

        int n0 = 0;
        int n1 = 1;
        int n2 = 1;

        int n3 = 0;
        for(int i = 3; i <= n; i++) {
            n3 = n0 + n1 + n2;
            System.out.print(" "+n3);
            n0 = n1;
            n1 = n2;
            n2 = n3;
        }

        return n3;
    }
    public static void main(String[] args) {
        System.out.println("\nans = "+fibo(25));
    }
}
