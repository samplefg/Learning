package JAVAPractise;
// import static java.lang.Integer.*;//error
import static java.lang.Integer.MAX_VALUE;//bcz resolved order
import static java.lang.Byte.*;
// import static java.lang.Math.random;//Static import(Explicit)
// import static java.lang.Math.round;
// import static java.lang.Math.max;
// import static java.lang.Math.floor;
import static java.lang.Math.*;//Static import(implicit)
import java.util.Scanner;//(Syntax: import packagename.classname)
public class StsticImportAndNormalImport {//Normal import
    // java.util.Scanner sc1 = new java.util.Scanner(System.in);
    //java.util.Scanner is fully qualified name(but problem is readability is reduced)
    // java.util.Scanner sc2 = new java.util.Scanner(System.in);
    // java.util.Scanner sc3 = new java.util.Scanner(System.in);
    // java.util.Scanner sc4 = new java.util.Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    /*Arraylist
      Impicit import - import java.util.*;
      Explicit import - import java.util.Arraylist;
    */
}
//Static Import(Explicit)
class StaticImport{
    double x = random();
    long k = round(5.2);
    long y = max(5, 6);
    double z = floor(10.9);
}
//Static import is not good for Programmer:-
//Compiler members compile in some orders:
//(1.current class static member,2.Explicit static import,3.Implicit static import).
class Static{
    public static void main(String[]args){
      int MAX_VALUE = 10;//resolved order in static member
      System.out.println(MAX_VALUE);
}
}
