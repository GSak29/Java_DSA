package tree;

import java.util.*;

class BinaryNode {
    int val;
    BinaryNode left, right;

    public BinaryNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Binary {
    BinaryNode root;

    public Binary() {
        root = null;
    }

    public void inOrder(BinaryNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.val + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(BinaryNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrder(node.left);

            preOrder(node.right);
        }
    }

    public void postOrder(BinaryNode node) {
        if (node != null) {
            postOrder(node.left);

            postOrder(node.right);
            System.out.print(node.val + " ");
        }
    }

    public void insert(int val) {
        BinaryNode newNode = new BinaryNode(val);
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            BinaryNode current = queue.poll();

            if (current.left == null) {
                current.left = newNode;
                break;
            } else {
                queue.offer(current.left);
            }

            if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.offer(current.right);
            }
        }

    }

    public static void main(String[] args) {

        Binary tree = new Binary();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

        System.out.println("In order Traversal: ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("pre order Traversal: ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("post order Traversal: ");
        tree.postOrder(tree.root);
    }

}