public class PowerOfThree {
    public static void main(String[] args) {

        int n = 1162261467;

        boolean flag = true;
        while(n/3 > 1) {
            int i = n/3;
            float f = n/3f;

            n /= 3;
            System.out.println(i+" "+f);
            
            if(i != f) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
