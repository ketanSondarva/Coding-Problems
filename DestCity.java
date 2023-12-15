import java.util.HashMap;
import java.util.List;

// leetcode: 1436. Destination City

// // desceription:

/*  You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
    It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city. */

public class DestCity {
    public String destCity(List<List<String>> paths) {
        
        HashMap<String, String> map = new HashMap<>();

        paths.forEach(list -> {
            map.put(list.get(0), list.get(1));
        });

        String answer = "";

        // // break and return is not allowed in forEach 
        // paths.forEach(list -> {
        //     if(map.get(list.get(0)) == null) {
        //         destination = list.get(0);
        //         break;
        //     }
        //     if(map.get(list.get(1) == null)) {
        //         destination = list.get(1);
        //         break;
        //     }
        // });

        for(List list : paths) {
            String source = String.valueOf(list.get(0));  // to cnovert Object into String
            String destination = String.valueOf(list.get(1));

            if(map.get(source) == null)
                return source;
            if(map.get(destination) == null)
                return destination;
        }

        System.out.println(map);

        return answer;
    }
}
