package BFS;

// LC: 1926. Nearest Exit from Entrance in Maze

import java.util.LinkedList;
import java.util.Queue;

public class NearestExit {
    public int nearestExit(int[][] maze, int[] entrance) {
                int rows = maze.length;
        int columns = maze[0].length;

        Queue<int []> queue = new LinkedList<>();
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        
        int[][] directions = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};

        int steps = 0;
        int x, y;

        while(!queue.isEmpty()) {
            steps++;

            int n = queue.size();

            for(int i = 0; i < n; i++) {
                int[] current = queue.poll();

                for(int [] direction: directions) {
                    x = current[0] + direction[0];
                    y = current[1] + direction[1];

                    // check if this direction out of bound
                    if(x < 0 || x >= rows || y < 0 || y >= columns) continue;

                    if(maze[x][y] == '+') continue;

                    if(x == 0 || x == rows - 1 || y == 0 || y == columns - 1) return steps;

                    maze[x][y] = '+';
                    queue.offer(new int[] {x,y});
                }
            }
        }
        return -1;
    }
}
