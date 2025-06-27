package Linkedlist;

class Node {
    int data;
    Node link; // it is a reference
}

class Method {
    static Node head;
    static Node tail;
    static Node p;
    static Node q;

    public static void insertAtEnd(int data) {

        Node newNode = new Node();
        newNode.data = data;
        newNode.link = null;
        if (head == null) { // head is null list is empty so we are pointing head to newnode
            head = newNode;
            tail = newNode;
        } else {
            tail.link = newNode;
            tail = newNode;
        }

    }

    public static void insertAtBegin(int data) {

        Node newNode = new Node();
        newNode.data = data;
        newNode.link = null;
        if (head == null) { // head is null list is empty so we are pointing head to newnode
            head = newNode;

        } else {
            newNode.link = head;
            head = newNode;
        }

    }

    public static void insertAtPos(int data, int pos) {

        Node newNode = new Node();
        newNode.data = data;
        p = head;
        {
            for (int i = 0; i < pos; i++) {
                q = p;
                p = p.link;
            }
            q.link = newNode;
            newNode.link = p;
        }

    }

    public static void delAtPos(int pos) {

        p = head;
        if(pos==0){
            head=head.link;
        }else
        {
            for (int i = 0; i < pos; i++) {
                q = p;
                p = p.link;
            }
            q.link = p.link;

        }

    }

    static void display() {
        p = head;
        while (p != null) {
            System.out.print((char) p.data + " ");
            p = p.link;
        }
    }
}

public class SinglyLinkedList extends Method {
    public static void main(String[] args) {
        insertAtEnd(71);
        insertAtEnd(85);
        insertAtEnd(82);
        insertAtEnd(85);
        display();
        head = null;
        System.out.println();
        insertAtBegin(71);
        insertAtBegin(85);
        insertAtBegin(82);
        insertAtBegin(85);
        display();
        System.out.println();
        insertAtPos(65, 4);
        display();
        System.out.println();
        delAtPos(0);
        display();

    }

}