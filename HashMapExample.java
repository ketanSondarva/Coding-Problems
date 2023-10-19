import java.util.HashMap;

public class HashMapExample {
    
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1,1);
        map.put(1,1);

        System.out.println(map.size());

        System.out.println("Hash map: "+map);
    }
}
