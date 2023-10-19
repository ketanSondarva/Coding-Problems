import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindResturant {
    public static String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < list1.length; i++)
            map.put(list1[i], i);

        int leastIdx = findLeastIdx(map, list2);
        System.out.println(leastIdx);

        int least = 0;
        for(int i = 0; i < list2.length; i++) {
            if(map.containsKey(list2[i])) {
                least = i + map.get(list2[i]);
            }
            if(least == leastIdx)
                list.add(list2[i]);
        }

        String result[] = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
            

        return result;

    }

    public static int findLeastIdx(HashMap<String, Integer> map, String list[]) {

        int least = Integer.MAX_VALUE;
        int min = least;
        for(int i = 0; i < list.length; i++) {
            if(map.containsKey(list[i])) {
                least = i + map.get(list[i]);
            }
            if(least < min) {
                min = least;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        // String[] list1= {"Shogun","Tapioca Express","Burger King","KFC"};
        // String[] list2 = {"Piatti","Shogun","Hungry Hunter Steakhouse","KFC","Burger King"};

        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};

        System.out.println(Arrays.toString(findRestaurant(list1, list2)));

    }
}
