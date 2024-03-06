public class DeleteFirstNodeOfLinkedList {
    private ListNode head;//ListNode:Instance variable add, Head:Holding complete List 

    private static class ListNode{
        private int data;//Can be a generic type 
        private ListNode next;//Reference to next ListNode is List

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
    //Display data in present of LinkedList
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.println(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
    //Insert in 1st method
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }
    //Insert in Last method
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
    //Delete 1st Node
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;//Create a temporary Node Variable
        head = head.next;
        temp.next = null;
        return temp; 
    }
    //Delete Last Node
    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode privious = null;
        while(current.next != null){
            privious = current;
            current = current.next;
        }
        privious.next = null;//break the chain
        return current;
    }
    //print the Node
    public static void main(String[]args){
        DeleteFirstNodeOfLinkedList dfsll = new DeleteFirstNodeOfLinkedList();
        dfsll.insertLast(11);
        dfsll.insertLast(8);
        dfsll.insertLast(1);
        dfsll.insertLast(10);

        dfsll.display();

        // System.out.println(dfsll.deleteFirst().data);
        System.out.println(dfsll.deleteLast().data);
        dfsll.display();

    }

}

