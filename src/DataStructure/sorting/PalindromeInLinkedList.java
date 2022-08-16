package DataStructure.sorting;

public class PalindromeInLinkedList {

    class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;

        }
    }

    public int size;
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        //create a new node
        Node newNode = new Node(data);

        //check if the list is empty
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node reverseList(Node temp) {
        Node current = temp;
        Node prevNode = null, nextNode = null;

        //swap the previous and next nodes
        while (current != null) {
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }

    public void isPalindromeLL() {
        Node current = head;
        boolean flag = true;

        int mid = (size%2 == 0) ? (size / 2) : ((size + 1) / 2);

        for (int i = 1; i < mid; i++) {
            current = current.next;
        }

        //Reverse the list after middle node to end
        Node revHead = reverseList(current.next);

        //compare nodes of first half and second half
        while(head != null && revHead != null) {
            if(head.data != revHead.data) {
                flag= false;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }

        if(flag) {
            System.out.println("Given linked list is palindrome.");
        }
        else {
            System.out.println("Given linked list is not palindrome.");
        }
    }


    public void display () {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of singly linked list ...");
        while (current != null ) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        PalindromeInLinkedList sList = new PalindromeInLinkedList();

        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(1);
        sList.addNode(1);

        sList.display();

        sList.isPalindromeLL();
    }
}
