package DataStructure;

public class DeleteSinglyLinkedList {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void deleteBeginning(int key) {
        Node temp = head, prev = null;

        if(temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp!= null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    public void deleteMid(){}
    public void deleteEnd() {}
    public void printList() {}
    public static void main(String[] args) {}
}