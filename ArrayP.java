public class ArrayP {
    static int arr[];
    static int size;
    static int capacity;

    public ArrayP(int capacity) {
        arr = new int[capacity];
        size = 0;
        this.capacity = capacity;
    }

    public void insert(int data) {
        if (size < capacity) {
            arr[size++] = data;
            System.out.println(data + " Inserted elenent.");
        } else {
            System.out.println("Cannot insert element.");
        }
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Cannot delete element.");
        } else {
            System.out.println(arr[index] + " Deleted element.");
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = 0; 
            size--;
        }
    }

    public void display() {
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayP array = new ArrayP(5);

        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.display();

        array.delete(1);
        array.display();

        array.insert(4);
        array.display();
    }
}
