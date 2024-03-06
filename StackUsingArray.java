public class StackUsingArray {
    static int arr[];//array define
       
    static int top = -1;

    StackUsingArray(int n){//Create in size of Constructer
        //Array in same size declear
        arr = new int[n];
    }
   
    
       
       //insert data in Stack
       public void Push( int data){
          arr[top+1] = data;
          top = top+1;
       }
    
    //Implement in 2nd Function Remove(POP)-->Time Complexity->O(1)
    public void pop(){//int-->return type->bcz target is return remove value also
            arr[top] = 0;
            top =  top-1;
        
    }
    //Implement in 3rd Function Peek(Searching)
    public int peek(int data){
            int temp = top;
            while(temp!=-1){
                if(arr[temp]==data){
                    return temp;
                }
                temp = temp - 1;
            }
            return -1;
        
    }
 
    public void display(){
        
    }
public static void main(String[]args){
    StackUsingArray s = new StackUsingArray(5);
    s.Push(1);
    s.Push(2);
    s.Push(3);


    //output:1 2 3....
    // while(!s.isEmpty()){//If not queue is not empty then peek in element is one by one manner
    //     System.out.println(s.peek());
    //     s.pop();
    // }
} 
}

