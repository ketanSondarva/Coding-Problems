package Dynamic_Programming.Fibonacci;

public class Recursive {

    // printing nth fibonacci number:
    static int fibo(int n) {
        if(n == 0 || n == 1) 
            return n;
    
        return fibo(n-1) + fibo(n-2);
    }


    public static void main(String[] args) {    
        System.out.print(fibo(9));
    }
}
