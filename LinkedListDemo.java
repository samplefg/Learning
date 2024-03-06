class Node{
    char value;
    Node address;
    public Node(char v){
        this.value = v;
        this.address = null;
    }
}
public class LinkedListDemo {
    Node HeadNode = null;
    public  void insertNode(char ins){
        Node newNode = new Node(ins);
        if(HeadNode == null){
           HeadNode = newNode;
        }
        else{
            Node temp = HeadNode;

            while(temp.address != null){ ;
                temp = temp.address;
            }

            temp.address = newNode;
        }
    }

    public void display(){
        Node temp = HeadNode;
        while(temp.address != null){
            temp = temp.address;
            char ins = temp.value;
            System.out.println(ins);
        }
    }
    public static void main(String []args){
        LinkedListDemo li = new LinkedListDemo();
        li.insertNode('a');
        li.insertNode('b');
        li.insertNode('c');
        li.insertNode('d');
        li.insertNode('e');

        li.display();


        

        
    }
}




