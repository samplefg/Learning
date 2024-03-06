package solutions;

public class ArrayOperations {

    private int[] array;
    private int size;

    public ArrayOperations(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void insertAtEnd(int element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            System.out.println("Array is full, cannot insert.");
        }
    }

    public void display() {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void insertAtMiddle(int element, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (size < array.length) {
            for (int i = size; i > position; i--) {
                array[i] = array[i - 1];
            }
            array[position] = element;
            size++;
        } else {
            System.out.println("Array is full, cannot insert.");
        }
    }

    public void deleteFromMiddle(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        for (int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void rotateLeft(int positions) {
        for (int i = 0; i < positions; i++) {
            int temp = array[0];
            for (int j = 0; j < size - 1; j++) {
                array[j] = array[j + 1];
            }
            array[size - 1] = temp;
        }
    }

    public void rotateRight(int positions) {
        for (int i = 0; i < positions; i++) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }

    public static void main(String[] args) {
        ArrayOperations arrayOps = new ArrayOperations(5);

        arrayOps.insertAtEnd(1);
        arrayOps.insertAtEnd(2);
        arrayOps.insertAtEnd(3);
        arrayOps.display();  // Output: Array elements: 1 2 3

        arrayOps.insertAtMiddle(5, 1);
        arrayOps.display();  // Output: Array elements: 1 5 2 3

        arrayOps.deleteFromMiddle(2);
        arrayOps.display();  // Output: Array elements: 1 5 3

        arrayOps.rotateLeft(1);
        arrayOps.display();  // Output: Array elements: 5 3 1

        arrayOps.rotateRight(2);
        arrayOps.display();  // Output: Array elements: 3 1 5
    }
}

