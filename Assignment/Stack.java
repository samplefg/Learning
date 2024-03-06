public class Stack {

    private int maxSize;  // Maximum size of the stack
    private int[] stackArray;  // Array to store stack elements
    private int top;  // Index of the top element in the stack

    // Constructor to initialize the stack with a specified size
    public Stack(int size) {
        // Your code here
    }

    // Function to push an element onto the stack
    public void push(int element) {
        // Your code here
    }

    // Function to pop the top element from the stack
    public int pop() {
        // Your code here
        return 0;  // Placeholder return value
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        // Your code here
        return false;  // Placeholder return value
    }

    // Function to check if the stack is full
    public boolean isFull() {
        // Your code here
        return false;  // Placeholder return value
    }

    // Function to peek at the top element without removing it
    public int peek() {
        // Your code here
        return 0;  // Placeholder return value
    }

    // Function to get the size of the stack
    public int size() {
        // Your code here
        return 0;  // Placeholder return value
    }

    // Additional operations can be added based on requirements

    // Explanation for the constructor
    // This method initializes the stack with a specified maximum size. It creates an array to store elements and initializes the top index.

    // Explanation for push method
    // This method adds an element to the top of the stack.

    // Explanation for pop method
    // This method removes and returns the top element from the stack.

    // Explanation for isEmpty method
    // This method checks if the stack is empty and returns true if it is, false otherwise.

    // Explanation for isFull method
    // This method checks if the stack is full and returns true if it is, false otherwise.

    // Explanation for peek method
    // This method returns the top element of the stack without removing it.

    // Explanation for size method
    // This method returns the current number of elements in the stack.
    public static void main(String[] args) {
        solutions.Stack stack = new solutions.Stack(5);

        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: true

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: false
        System.out.println("Is stack full? " + stack.isFull());    // Output: false

        System.out.println("Peek at the top element: " + stack.peek());  // Output: 3

        System.out.println("Pop element: " + stack.pop());  // Output: 3

        System.out.println("Size of the stack: " + stack.size());  // Output: 2
    }
}

