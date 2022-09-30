package DataStructure;

public class AddSinglyLinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
     public void addfirst(int new_data) {
        Node new_node = new Node(new_data);
        //Make next of new Node as head
        new_node.next = head;
        //Move the head to point to new Node
        head = new_node;
     }

    public void insert_after(Node pre_node, int new_data) {
        if(pre_node == null) {
            System.out.println("This given previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        //Make next of new Node as next of previous node
        new_node.next = pre_node.next;
        //Make next of previous node as new node
        pre_node.next = new_node;
    }

    public void append(int new_data) {
        Node new_node= new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while(last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args)
    {
        /* Start with the empty list */
        AddSinglyLinkedList sList = new AddSinglyLinkedList();

        sList.addfirst(7);
        sList.addfirst(1);
        sList.addfirst(89);
        sList.addfirst(44);
        sList.addfirst(12);
        sList.addfirst(56);

        sList.insert_after(sList.head.next, 8);
        sList.append(4);

        System.out.println("\nCreated Linked list is: ");
        sList.printList();
    }
}

