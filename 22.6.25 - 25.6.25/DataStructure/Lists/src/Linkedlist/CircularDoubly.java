package Linkedlist;

//new change finally done

class CirDoubleNode {
    CirDoubleNode prev;
    int data;
    CirDoubleNode next;
}

class CirDoubleMethod {
    static CirDoubleNode head;
    static CirDoubleNode p;
    static CirDoubleNode q;

    static void insertAtEnd(int data) {
        CirDoubleNode newNode = new CirDoubleNode();
        newNode.data = data;
        p = head;
        if (head == null) { // head is null list is empty so we are pointing head to newnode
            head = newNode;
            newNode.next = head;
            head.prev = head;
        } else {
            do {
                p = p.next;
            } while (p.next != head);
            p.next = newNode;
            newNode.prev = p;
            newNode.next = head;
            head.prev = newNode;
        }

    }

    static void insertAtPos(int data, int pos) {
        CirDoubleNode newNode = new CirDoubleNode();
        newNode.data = data;
        p = head;
        {
            for (int i = 1; i < pos; i++) {
                p = p.next;
            }
            newNode.next = p.next;
            newNode.prev = p;
            p.next = newNode;
        }

    }

    static void delAtPos(int pos) {
        p = head;
        if (pos == 0) {
            do {
                p = p.next;
            } while (p.next != head);
            p.next = head.next;
            head = head.next;
            head.prev = p;

        } else {

            for (int i = 0; i < pos; i++) {
                q = p;
                p = p.next;
            }
            q.next = p.next;
            p.next.prev = q;
        }

    }

    static void display() {
        p = head;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != head);

    }

    static void rdisplay() {
        p = head;
        do {
            p = p.prev;
            System.out.print(p.data + " ");

        } while (p != head);

    }
}

public class CircularDoubly extends CirDoubleMethod {
    public static void main(String[] args) {
        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);

        display();
        System.out.println();

        insertAtPos(5, 3);
        display();
        System.out.println();
        delAtPos(0);
        display();
        System.out.println();
        rdisplay();

    }
}
