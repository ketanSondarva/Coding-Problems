package BinaryTree;

public class LevelOrderTraversal_nsqr {
    static class node {
        int data;
        node leftChild, rightChild;

        node(int data) {
            this.data = data;
            leftChild = rightChild = null;
        }
    }

    static node createNode(int data) {
        node newnode = new node(data);
        return newnode;
    }

    // finding the height of the tree:
    static int maxHeight(node root) {
        if(root == null) 
            return 0;
        else {
            int leftHeight = maxHeight(root.leftChild);
            int rightHeight = maxHeight(root.rightChild);

            if(leftHeight > rightHeight) 
                return (leftHeight+1);
            else
                return (rightHeight+1);
        }
    }


    // O(n^2) solution of the level order traversal:
    static void printLevel(node root, int level) {
        if(root == null) return;

        if(level == 1) {
            System.out.print(root.data+" ");
        } else {
            printLevel(root.leftChild, level-1);
            printLevel(root.rightChild, level-1);
        }
    }

    public static void main(String[] args) {
        node root = null;
        root = createNode(1);
        root.leftChild = createNode(2);
        // root.rightChild = createNode(3);
        // root.leftChild.leftChild = createNode(4);
        // root.leftChild.rightChild = createNode(5);


        root.leftChild.leftChild = createNode(3);
        root.leftChild.leftChild.leftChild = createNode(4);

        System.out.println(maxHeight(root));

        int height = maxHeight(root);

        for(int i = 1; i <= height; i++) printLevel(root, i);
    }
}
