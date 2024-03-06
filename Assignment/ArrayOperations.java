public class ArrayOperations {
    // The array to perform operations on
    private int[] array;
    private int position = 0;

    // Constructor to initialize the array
    public ArrayOperations(int size) {
        // Your code here
        array = new int[size];
    }

    // Function to insert an element at the end of the array
    public void insertAtEnd(int element) {
        // Your code here
        // for(int i = 0; i < array.length; i++){
        //     array[i] = element;
        // }

        //Array_name[index] = element(Sysntax)
        array[position] = element;
        position = position + 1;


    }

    // Function to display all elements in the array
    public void display() {
        // Your code here
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    // Function to insert an element at a specified position in the array
    public void insertAtMiddle(int element, int position) {
        // Your code here
        for(int i = array.length-1; i > position; i--){
            array[i] = array[i-1];
        }
        array[position] = element;
    }

    // Function to delete an element from a specified position in the array
    public void deleteFromMiddle(int position) {
        // Your code here
        for(int i = position; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = 0; 
    }

    // Function to rotate the array to the left by a given number of positions
    public void rotateLeft() {
        // Your code here
        int temp = array[0];
        for(int i = 0; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = temp;
    }

    // Function to rotate the array to the right by a given number of positions
    public void rotateRight() {
        // Your code here
        int temp = array[array.length-1];
        for(int i = array.length-1; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = temp;
    }

    // Additional functions can be added based on the learning objectives

    // Explaination for insertAtEnd method
    // This method adds an element to the end of the array, increasing its size by 1.

    // Explanation for display method
    // This method prints all the elements present in the array.

    // Explanation for insertAtMiddle method
    // This method inserts a new element at a specified position in the array, shifting other elements
    // accordingly.

    // Explanation for deleteFromMiddle method
    // This method removes an element from a specified position in the array, shifting other elements
    // accordingly.

    // Explanation for rotateLeft method
    // This method rotates the elements of the array to the left by a given number of positions.

    // Explanation for rotateRight method
    // This method rotates the elements of the array to the right by a given number of positions.

    // main method, this method will create a object of ArrayOperations class and pass the
    // size of the array as an argument to it on which all the operations will be performed.
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

        arrayOps.rotateLeft();
        arrayOps.display();  // Output: Array elements: 5 3 1

        arrayOps.rotateRight();
        arrayOps.display();  // Output: Array elements: 3 1 5
    }
}
