public class LinkedListP {
    private LinkedListP head;
    private int data;
    private LinkedListP next;

    LinkedListP(){
      
    }

      public LinkedListP(int data){
         this.data = data;
         this.next = null;
      }
   
   //Length of the LinkedList
   public int length(){
      if(head == null){
         return 0;
      }
      int count = 0;
      LinkedListP current = head;
      while(current != null){
         count++;
         current = current.next;
      }
      return count;
   }
   //Display data present in LinkedList
   public void display(){
      LinkedListP current = head;
      while(current != null){
         System.out.print(current.data + "-->");
         current = current.next;
      }
      System.out.println("null");
   } 
   //Insert in 1st Method
   public void insertFirst(int value){
      LinkedListP newNode = new LinkedListP(value);
      newNode.next = head;
      head = newNode;
   }
   //Insert in Last Method
   public void insertLast(int value){
      LinkedListP newNode = new LinkedListP(value);
      if(head == null){
         head = newNode;
         return;
      }
      LinkedListP current = head;
      while(null != current.next){
         current = current.next;
      }
      current.next = newNode;
   }
   //Searching of LinkedList
   public boolean find(LinkedListP head, int Searchkey){
      if(head == null){
         return false;
      }
      LinkedListP current = head;
      while(current != null){
         if(current.data == Searchkey){
            return true;
         }
         current = current.next;
      }
      return false;
   }

   //Delete 1st Node
   public LinkedListP deleteFirst(){
    if(head == null){
        return null;
    }
    LinkedListP temp = head;
    head = head.next;
    temp.next = null;
    return temp; 
}
//Delete Last Node
public  LinkedListP deleteLast(){
    if(head == null || head.next == null){
        return head;
    }
    LinkedListP current = head;
    LinkedListP privious = null;
    while(current.next != null){
        privious = current;
        current = current.next;
    }
    privious.next = null;
    return current;
}
   public static void main(String[]args){
      LinkedListP head = new LinkedListP(10);
      LinkedListP second = new LinkedListP(8);
      LinkedListP third = new LinkedListP(1);
      LinkedListP fourth = new LinkedListP(11);

      
      head.next = second;
      second.next = third;
      third.next = fourth;
      

      LinkedListP sll = new LinkedListP();
      sll.display();

      if(sll.find(head, 1)){
         System.out.println("Search key found!!!");
      }else{
         System.out.println("Search key not found!!!");
      }   
         
//  dfsll = new DeleteFirstNodeOfLinkedList();
// dfsll.insertLast(11);
// dfsll.insertLast(8);
// dfsll.insertLast(1);
// dfsll.insertLast(10);

// dfsll.display();


// System.out.println(dfsll.deleteLast().data);
// dfsll.display();
    
 }
   

}