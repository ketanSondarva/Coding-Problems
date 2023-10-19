import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class RelativeRank {

    public static String[] findRelativeRanks(int[] score) {
        
        String[] result = new String[score.length];

        if(score.length == 1) {
            result[0] = "Gold Medal";
            return result;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < score.length; i++) {
            map.put(score[i], i);
            result[i] = "0";
        }

        for(int i = 0; i < score.length; i++) {
            System.out.println(score[i]+" "+map.get(score[i]));
        }


        Arrays.sort(score);

        int count = 1;

        for(int i = score.length-1; i >= 0; i--) {

            if(count == 1) {
                result[map.get(score[i])] = "Gold Medal";
            } 
            else if(count == 2) {
                result[map.get(score[i])] = "Silver Medal";
            } else if(count == 3) {
                result[map.get(score[i])] = "Bronze Medal";
            }
             else {
                 result[map.get(score[i])] = Integer.toString(count);
             }

             count++;
        }

        return result;
    }

        public static void main(String[] args) {
            int result[] = {10,3,8,9,4};

            System.out.println(Arrays.toString(findRelativeRanks(result)));
        }
}
