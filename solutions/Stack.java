package solutions;

public class Stack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        if (!isFull()) {
            top++;
            stackArray[top] = element;
        } else {
            System.out.println("Stack overflow, cannot push element " + element);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int poppedElement = stackArray[top];
            top--;
            return poppedElement;
        } else {
            System.out.println("Stack underflow, cannot pop element");
            return -1;  // Placeholder return value for empty stack
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty, cannot peek");
            return -1;  // Placeholder return value for empty stack
        }
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

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

