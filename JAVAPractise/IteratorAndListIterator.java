package JAVAPractise;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;


public class IteratorAndListIterator {
    public static void main(String[]args){
        List l = new ArrayList();

        l.add(10);
        l.add("Abhishek");
        l.add("Ashwini");

        //System.out.println(l);//print in this manner [10, Abhishek, Ashwini]

        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());//print in this one by one 10 then
            // Abhishek then Ashwini
        }
    }
}
class ListIterators{ 
    public static void main(String[]args){
        List<String> ls = new ArrayList<String>();

        // ls.add(10);
        ls.add("Abhishek");
        ls.add("Ashwini");

       // System.out.println(ls);

        ListIterator<String> li = ls.listIterator();
        while(li.hasPrevious()){
            System.out.println(li.previous());//print in this one by one 10 then
            // Abhishek then Ashwini
        }
    }
}
