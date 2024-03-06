public class StackUsingArrayP {
    static int arr[];
    static int top = -1;

    StackUsingArrayP(int n) {
        arr = new int[n];
    }

    public void push(int data) {
        arr[top + 1] = data;
        top = top + 1;
    }

    public void pop() {
        arr[top] = 0;
        top = top - 1;
    }

    public int peek(int data) {
        int temp = top;
        while (temp != -1) {
            if (arr[temp] == data) {
                return temp;
            }
            temp = temp - 1;
        }
        return -1;
    }

    public void display() {
        System.out.println("Stack elements:");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArrayP s = new StackUsingArrayP(5);
        s.push(1);
        s.push(2);
        s.push(3);

        s.display(); 
    }
}
