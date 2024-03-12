package JAVAPractise;
//In java there are 12 access modifire they are as following 
//-public
//-private
//-protected
//-default
//-final: Final class can not be inherite abd final method can not be override in child class.
        //Every method in final class is always final, every variable in final class 
        //need not to be final.
        //Disavantage of final keyword is that it restrict/not allow oops concept like 
        //inheritance in polymorphism.
//-abstarct: Applicable for class and method but not for variable.
           //Abstract keyword is not allowed with final, native, synchrinized, static, private, strictfp
           //if we are trying to used to abstract with these modifire then we will get complile time error
           //saying iligal combination of modifires.
//-static
//-synchronized
//-native
//-strictfp
//-transient
//-volatile
//impt-public, default, final, abstarct, strictfp are allowed at top class level 
//addition to this five private, protected, and static can be used for the inner calss level.
abstract class c2{
    abstract void present();//Abstract method don't have a body, the body should provided by
    // the child class.
    //The visual modifire(public, private, protected, default) should be same in the child class 
    //method implimentation.
    //If a method is abstarct then class is compulsary to be abstract. But if a class is abstract
    //it is not compulsary for method to be abstract type it can be abstrct type or non-abstract type.
    //impt- Reason for a class to be abstract when a method is abstract.
    //As a parent class abstract method dose not contain any implimentation, so the creation of 
    //object of this class is not allowed thats why we need to define the class is abstract.
    //Abstract class can contain final method but final class can not have abstract method.
    public void gift(){
        System.out.println("dog");
    }
}
class c3 extends c2{
    void present(){
        System.out.println("cat");
    }
}
class c1{
    class InnerClassExample{
        public void display(){
            System.out.println("Hello World");
        }
    }
    public int x = 4;
    private int y = 45;
    int z = 54;
    protected int k = 43; 
    public void math(){
        // c1 r = new c1();
        InnerClassExample icee = new InnerClassExample();
        icee.display();//To call a innerclass inside  the same outer class it is created 
        //we can simply call by creating call by inner class. 
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
    }
}

public class AccessModifiers {
    public static void main(String[]args){
        c1 c = new c1();
        //c.math();
        System.out.println(c.x);
        // System.out.println(c.y);//private in same package is not acceptable 
        System.out.println(c.z);
        System.out.println(c.k);
        c1.InnerClassExample ice = new c1().new InnerClassExample();
        //c1 is the outer calss of which InnerClassExample is a inner calss to call
        // this inner class we have to call using outer class.  
    }
}
