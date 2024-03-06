package solutions;

public class Queue {

    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int element) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = element;
            currentSize++;
        } else {
            System.out.println("Queue is full, cannot enqueue element " + element);
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int dequeuedElement = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return dequeuedElement;
        } else {
            System.out.println("Queue is empty, cannot dequeue element");
            return -1;  // Placeholder return value for empty queue
        }
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty, cannot peek");
            return -1;  // Placeholder return value for empty queue
        }
    }

    public int size() {
        return currentSize;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        System.out.println("Is queue empty? " + queue.isEmpty());  // Output: true

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Is queue empty? " + queue.isEmpty());  // Output: false
        System.out.println("Is queue full? " + queue.isFull());    // Output: false

        System.out.println("Peek at the front element: " + queue.peek());  // Output: 1

        System.out.println("Dequeue element: " + queue.dequeue());  // Output: 1

        System.out.println("Size of the queue: " + queue.size());  // Output: 2
    }
}

