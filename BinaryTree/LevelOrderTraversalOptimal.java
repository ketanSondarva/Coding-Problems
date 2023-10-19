package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// level order traversal using BFS algorithm:

public class LevelOrderTraversalOptimal {
    static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    
    static node createNode(int data) {
        node newnode = new node(data);
        return newnode;
    }

    

    // linearly priting:
    static void printLevels(node root) {
        
        Queue<node> que = new LinkedList<>();
        que.add(root);

        while(! que.isEmpty()) {
            node curr = que.poll();
            System.out.print(curr.data+" ");

            if(curr.left != null) que.add(curr.left);
            if(curr.right != null) que.add(curr.right);
        }
    }

    static void printAllLevels(node root) {
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        // System.out.println(root.data);
        while(!q.isEmpty()) {
            node curr = q.poll();

            if(curr == null) {
                if(q.isEmpty()) return;

                q.add(null);
                System.out.println();
            } else {
                System.out.print(curr.data+" ");
            }

            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
    }

    // level by level;
    private static List<List<Integer>> result = new ArrayList<>();
    private static List<Integer> level = new ArrayList<>();

    static void fillAllLevel(node root) {
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(! q.isEmpty()) {
            node curr = q.poll();

            if(curr == null) {
                if(q.isEmpty()) 
                    return;
                
                q.add(null);
                result.add(level);
                level = new ArrayList<>();

            } else {
                level.add(curr.data);
            }

            // giving null pointer exception, dont know why:
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        node root = null;
        root = createNode(1);
        root.left = createNode(2);
        root.left.left = createNode(3);


        printLevels(root);

        System.out.println("\nprinting all levels: ");
        printAllLevels(root);
        // fillAllLevel(root);
        // System.out.println(result);
    }

}
