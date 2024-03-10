package JAVAPractise;
public class Variable {
    
    public static void main(String[]args){
    
       final int c = 30;//Local variable
       //Local variable are required initialize at the time of declaration or before using the variable.
       //Public, Private, Default and Protected are not applicable to local variable as 
       //scope is fixed of local variable.
       //Only Final applicable to local variable. 
       //Local variable is Thread shape.
       System.out.println(Example.a);
       //To access a static variable we just need class name not a class object so creating 
       //object of class is optional for accessing static variable or method
       Example em = new Example(); 
       System.out.println(em.b);
       em.Test(10);
       em.Test(11);
    }
}
class Example{
    static int a = 10;//static variable(not change in object to object)
    //JVM dont provide default value if not initialized.
    //Store in method area.
    //Scope is same as class file.
    int b = 20;//Global Variable
    int y = 0;//Instance Variable(change in object to object is known as Instance variable)
    //Instance variable should be decleare inside a class but outside of a method, block or
    //consturctor.
    //Scope of Instance variable is same as object, once object is destroy instance variable 
    //also get destroy.
    //Instance variable is store in heap memory as the part of object.
    //For Instance variable JVM will always provide defualt value, so it is neccessery to insialize.
    public void Test(int x){//int x is a local variable as it can not be access outside Test method
        this.y = x;
        System.out.println(y);
    }
}
