package Stack;

import java.util.Arrays;
import java.util.Stack;

class AsteroidCollision {
    public static int[] asteroidCollision(int[] arr) {
        int length = arr.length - 1;
        // {3,5,-6,-4,-7};

        Stack<Integer> stk = new Stack<>();
        stk.push(arr[0]);

        for(int i = 1; i <= length; i++) {
            while(!stk.isEmpty() && stk.peek() > 0 && arr[i] < 0) {
                int sum = arr[i] + stk.peek();

                if(sum < 0) {
                    stk.pop();
                } else if(sum > 0) {
                    arr[i] = 0; // it will break while loop
                } else {
                    stk.pop();
                    arr[i] = 0; // it will break while loop
                }
            }

            if(arr[i] != 0) {
                stk.push(arr[i]);
            }
        }

        int ans[] = new int[stk.size()];
        int i = stk.size() - 1;
        while(!stk.isEmpty()) {
            ans[i] = stk.pop();
            i--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,-6,-4,-7};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }
}