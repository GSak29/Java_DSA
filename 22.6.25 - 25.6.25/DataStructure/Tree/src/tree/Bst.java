package tree;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }

}

public class Bst {
    Node root;

    public Bst() {
        root = null;
    }

    public Node search(int data){

        Node current = root;
        while(current != null){
            if(data<current.data){
                    current = current.left;
              
            }else if(data>current.data){
                current = current.right;
            }else if(data==current.data){
                return current;
            }else{
                return null;
            }
        }return null;
   }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        } else {
            Node current = root;

            while (true) {
                if (data <= current.data) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);

            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);

            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {

         Bst tree = new Bst();
     tree.insert(50);
     tree.insert(30);
     tree.insert(20);
     tree.insert(40);
     tree.insert(70);
     tree.insert(60);
     tree.insert(80);

     System.out.println("In-order Traversal:");
     tree.inOrder(tree.root);
     System.out.println();

     System.out.println("Pre-order Traversal:");
     tree.preOrder(tree.root);
     System.out.println();

     System.out.println("Post-order Traversal:");
     tree.postOrder(tree.root);
     System.out.println();

     System.out.println(tree.search(20));
 }

}