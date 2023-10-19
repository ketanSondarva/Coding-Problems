import java.lang.reflect.Array;
import java.util.Arrays;

public class plusOne {
    
        public int[] PlusOne(int[] digits) {
            
            int n = digits.length;

            int num = 0;
            for(int i=0; i<n; i++) {
                num = num*10 + digits[i];
            }

            num++;

            System.out.println(num);

            // Count no. of digits:
            int length = 0;
            int temp = num;
            while(temp != 0) {
                length++;
                temp/=10;
            }

            System.out.println("length = "+length);
            System.out.println(num);

            int[] result = new int[length];

            for(int i=length-1; i>=0; i--) {
                result[i] = num%10;
                num/=10;
            }

            System.out.println(num%10);
            System.out.println(num/10);
            return result;
        }

        public static void main(String[] args) {
            plusOne p = new plusOne();

            int a[] = {9};

            System.out.println(Arrays.toString(p.PlusOne(a)));
        }
    
}
