package DFS;

// Leetcode: 841. Keys and Rooms

import java.util.List;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        // int size = rooms.size();

        dfs(rooms, 0, visited);
        for(boolean isVisited : visited) {
            if(!isVisited) return false;
        }

        return true;
    }

    void dfs(List<List<Integer>> rooms, int source, boolean[] visited) {
        visited[source] = true;

        for(Integer key : rooms.get(source)) {
            if(!visited[key]) 
                dfs(rooms, key, visited);
        }
    }
}
