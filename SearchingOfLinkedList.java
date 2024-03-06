public class SearchingOfLinkedList {

   private ListNode head;

   private static class ListNode{
      private int data;//can be a generic type
      private ListNode next;//Reference to next ListNode in list

      public ListNode(int data){
         this.data = data;
         this.next = null;
      }
   }
   //Length of the LinkedList
   public int length(){
      if(head == null){
         return 0;
      }
      int count = 0;
      ListNode current = head;
      while(current != null){
         count++;
         current = current.next;
      }
      return count;
   }
   //Display data present in LinkedList
   public void display(){
      ListNode current = head;
      while(current != null){
         System.out.print(current.data + "-->");
         current = current.next;
      }
      System.out.println("null");
   } 
   //Insert in 1st Method
   public void insertFirst(int value){
      ListNode newNode = new ListNode(value);
      newNode.next = head;
      head = newNode;
   }
   //Insert in Last Method
   public void insertLast(int value){
      ListNode newNode = new ListNode(value);
      if(head == null){
         head = newNode;
         return;
      }
      ListNode current = head;
      while(null != current.next){
         current = current.next;
      }
      current.next = newNode;
   }
   //Searching of LinkedList
   public boolean find(ListNode head, int Searchkey){
      if(head == null){
         return false;
      }
      ListNode current = head;
      while(current != null){
         if(current.data == Searchkey){
            return true;
         }
         current = current.next;
      }
      return false;
   }
   public static void main(String[]args){
      //Create a LinkedList
      ListNode head = new ListNode(10);
      ListNode second = new ListNode(8);
      ListNode third = new ListNode(1);
      ListNode fourth = new ListNode(11);

      //Attach them together to form a list
      head.next = second;//10, 8
      second.next = third;//10, 8, 1
      third.next = fourth;//10, 8, 1, 11
      

      SearchingOfLinkedList sll = new SearchingOfLinkedList();
      sll.display();

      if(sll.find(head, 1)){
         System.out.println("Search key found!!!");
      }else{
         System.out.println("Search key not found!!!");
      }   
   }
   

   

   // 10, 1, 11
//     Searchkey = 12
//     listNode current = head;
//     while(current != null){
//         if(current.data == searchkey){
//             return true;
//         }
//         current = current.next;
//     }

// public ListNode deleteFirst(){
//     if(head == null){
//         return null;
//     }
// }

// ListNode temp = head;
//    head = head.next;
//    temp.next = null;
//    return temp;
//  }
}