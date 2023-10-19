public class ReverseInteger {
    public static int reverse(int x) {

        // StringBuffer sb = new StringBuffer();

        // System.out.println(x%10);

        // // int x = Math.abs(x);

        // // remove zero from the end:
        // while(x%10 == 0) {
        //    x /= 10;
        // }

        // System.out.println("x = "+x);
        // if(x < 0) {
        //     sb.append(x%10);
        //     x /= 10;
        //     x = Math.abs(x);
        // }

        // // int count = 1;
        // while(x != 0) {

        //     sb.append(Integer.toString(x%10));
        //     x /= 10;
        //     // count *= 10;

        // }

        // // System.out.println("count = "+count);
        // // System.out.println(x/(count/10));

        // return Integer.parseInt(sb.toString());
        
        int temp = x;
        x = Math.abs(x);
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        int num = Integer.parseInt(sb.toString());
        return (temp < 0)? -num : num;
    }

    public static void main(String[] args) {
        
        int result = reverse(1534236469);

        System.out.println("result = "+result);
    }

}
