import java.util.ArrayList;
import java.util.List;

public class PascalTriangleeetCode {
    public static List<List<Integer>> generate(int n) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        int line[][] = new int[n][n];

        List<Integer> list = null;
        for(int i = 0; i < n; i++) {
            list = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i)
                    line[i][j] = 1;
                else {
                    line[i][j] = line[i-1][j-1] + line[i-1][j];
                }
                list.add(line[i][j]);
            }
            triangle.add(list);
        }


        return triangle;

    }

    public static void main(String[] args) {
        
        System.out.println(generate(5));
    }
}
