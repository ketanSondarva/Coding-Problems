import java.util.ArrayList;
import java.util.List;

public class PascalTriangleIndex {
    public static List<Integer> getRow(int i) {

        List<Integer> list = new ArrayList<>();
        // for(int i = 0; i < rowIndex; i++) {
        //     if(i == 0 || i == rowIndex-1)
        //         list.add(1);
        //     else {
        //         int num = (factorial(rowIndex)/(factorial(rowIndex-i)*factorial(i)));
        //         list.add(num);
        //     }
        // }
        for(int j = 0; j <= i; j++) {
            int num = factorial(i)/((factorial(i-j)*factorial(j)));
            System.out.print(i+"C"+j+" ");
            list.add(num);
        }
        
        return list;
    }

    public static int factorial(int n) {
        int fact = 1;
        for(int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(getRow(13));
    }
}
