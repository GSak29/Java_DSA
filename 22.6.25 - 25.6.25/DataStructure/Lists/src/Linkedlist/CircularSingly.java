package Linkedlist;

class CirSingleNode {
    int data;
    CirSingleNode next;
}

class CirSingleMethod {
    static CirSingleNode head;
    static CirSingleNode p;
    static CirSingleNode q;

    static void insertAtEnd(int data) {
        CirSingleNode newNode = new CirSingleNode();
        newNode.data = data;
        p = head;
        if (head == null) { // head is null list is empty so we are pointing head to newnode
            head = newNode;
            newNode.next = head;
        } else {
            do {
                p = p.next;
            } while (p.next != head);
            p.next = newNode;
            newNode.next = head;
        }

    }
     static void insertAtPos(int data,int pos) {
        CirSingleNode newNode = new CirSingleNode();
        newNode.data = data;
        p = head;
        {
            for(int i=1;i<pos;i++) {
                p = p.next;
            } 
             newNode.next = p.next;
            p.next = newNode;
        }

    }
    static void delAtPos(int pos) {
               p = head;
       {
            for(int i=0;i<pos;i++) {
                q=p;
                p = p.next;
            } 
             q.next=p.next;

        }

    }

    static void display() {
        p = head;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != head);

    }
}

public class CircularSingly extends CirSingleMethod {
    public static void main(String[] args) {
        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);

        display();
        System.out.println();
      
        insertAtPos(5,4);
        display();
        System.out.println();
        delAtPos(1);
        display();

    }
}
