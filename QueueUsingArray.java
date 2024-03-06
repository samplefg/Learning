public class QueueUsingArray {
  static class Queue{
    static int arr[];//array define
    static int size;
    static int rear = -1;

    Queue(int n){//Create in size of Constructer
        //Array in same size declear
        arr = new int[n];
        this.size = n;
    }
    //Implementation
    public static boolean isEmpty(){//queue element is empty or not
        return rear == -1;
    }
    //Implement in 1st Function Add(Enqueue)-->Time Complexity->O(1)
    public static void add(int data){//add in queue data
        if(rear == size-1){
            System.out.println("Full Queue");
            return;
        }
        rear++;
        arr[rear] = data;//Store in new element
    }
    //Implement in 2nd Function Remove(Dequeue)-->Time Complexity->O(n)
    public static int remove(){//int-->return type->bcz target is return remove value also
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;//present in queue is empty
        }
        int front = arr[0];
        for(int i = 0; i < rear; i++){//Queue's front stay in Zero index in Array
            arr[i] = arr[i+1];
        }
        rear --;
        return front;
    }
    //Implement in 3rd Function Peek(Front)
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[0];//Direct create in front
    }
  } 
  public static void main(String[]args){
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    //output:1 2 3....
    while(!q.isEmpty()){//If not queue is not empty then peek in element is one by one manner
        System.out.println(q.peek());
        q.remove();
    }
  } 
}
