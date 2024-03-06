public class LinkedListOperations {
    // Node class representing each element in the linked list
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head;

    // Constructor to initialize the linked list
    public LinkedListOperations() {
        // Your code here
    }

    // Function to insert a new element at the beginning of the linked list
    public void insertAtBeginning(int element) {
        // Your code here
    }

    // Function to insert a new element at the end of the linked list
    public void insertAtEnd(int element) {
        // Your code here
    }

    // Function to insert a new element at a specific position in the linked list
    public void insertAtPosition(int element, int position) {
        // Your code here
    }

    // Function to delete an element from a specific position in the linked list
    public void deleteAtPosition(int position) {
        // Your code here
    }

    // Function to search for an element in the linked list
    public boolean search(int element) {
        // Your code here
        return false;
    }

    // Function to display all elements in the linked list
    public void display() {
        // Your code here
    }

    // Explanation for insertAtBeginning method
    // This method adds a new element to the beginning of the linked list.

    // Explanation for insertAtEnd method
    // This method adds a new element to the end of the linked list.

    // Explanation for insertAtPosition method
    // This method inserts a new element at a specified position in the linked list, shifting other elements accordingly.

    // Explanation for deleteAtPosition method
    // This method removes an element from a specified position in the linked list, shifting other elements accordingly.

    // Explanation for search method
    // This method searches for a specific element in the linked list and returns true if found, false otherwise.

    // Explanation for display method
    // This method prints all the elements present in the linked list.
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
