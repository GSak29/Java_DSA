package Linkedlist;

class DubNode {

    int data;
    DubNode prev; // it is a reference
    DubNode next; // it is a reference
}

class DubMethod {
    static DubNode head;
    static DubNode tail;
    static DubNode p;
    static DubNode q;

    public static void delAtPos(int pos) {

        p = head;
        if(pos==0){
            
            head=head.next;
            head.prev=null;

        }else
        {
            for (int i = 0; i < pos; i++) {
                q = p;
                p = p.next;
            }
            q.next = p.next;
            p.next.prev = q;

        }

    }

    public static void insertAtPos(int data, int pos) {

        DubNode newNode = new DubNode();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = null;
        p = head;
        {
            for (int i = 0; i < pos; i++) {
                q = p;
                p = p.next;
            }
            q.next = newNode;
            newNode.prev = q;
            newNode.next = p;
            p.prev = newNode;
        }

    }

    public static void insertAtBegin(int data) {

        DubNode newNode = new DubNode();
        newNode.data = data;
        newNode.prev = null;
        newNode.next = null;
        if (head == null) { // head is null list is empty so we are pointing head to newnode
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    public static void insertAtEnd(int data) {

        DubNode newNode = new DubNode();
        newNode.data = data;
        newNode.prev = null;
        newNode.next = null;
        if (head == null) { // head is null list is empty so we are pointing head to newnode
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    static void display() {
        p = head;
        while (p != null) {
            System.out.print((char) p.data + " ");
            p = p.next;
        }
    }

    static void rdisplay() {
        p = tail;
        while (p != null) {
            System.out.print((char) p.data + " ");
            p = p.prev;
        }
    }

}

public class DoublyLinkedList extends DubMethod {
    public static void main(String[] args) {
        insertAtEnd(71);
        insertAtEnd(85);
        insertAtEnd(82);
        insertAtEnd(85);
        display();
        System.out.println();
        rdisplay();
        head = null;
        System.out.println();
        System.out.println("================");
        insertAtBegin(71);
        insertAtBegin(85);
        insertAtBegin(82);
        insertAtBegin(85);
        display();
        System.out.println();
        rdisplay();
        System.out.println();
        System.out.println("=================");
        insertAtPos(71, 3);
        display();
        System.out.println();
        rdisplay();
        System.out.println();
        System.out.println("=================");
        delAtPos(0);
        display();
        System.out.println();
        rdisplay();
    }

}