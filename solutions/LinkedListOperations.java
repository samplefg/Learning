package solutions;

public class LinkedListOperations {
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedListOperations() {
        head = null;
    }

    public void insertAtBeginning(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertAtPosition(int element, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(element);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Invalid position");
                return;
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtPosition(int position) {
        if (position < 0 || head == null) {
            System.out.println("Invalid position or empty list");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Invalid position");
                return;
            }
            current = current.next;
        }

        current.next = current.next.next;
    }

    public boolean search(int element) {
        Node current = head;
        while (current != null) {
            if (current.data == element) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListOperations linkedList = new LinkedListOperations();

        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.display();  // Output: 1 2 3

        linkedList.insertAtBeginning(0);
        linkedList.display();  // Output: 0 1 2 3

        linkedList.insertAtPosition(5, 2);
        linkedList.display();  // Output: 0 1 5 2 3

        linkedList.deleteAtPosition(3);
        linkedList.display();  // Output: 0 1 5 3

        System.out.println(linkedList.search(5));  // Output: true
        System.out.println(linkedList.search(4));  // Output: false
    }
}
