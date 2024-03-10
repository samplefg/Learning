package JAVAPractise;


public class InstanceOf {
    public static void main(String[]args){
        //To use newInstance(): The class should contain no argument constructer.
        //newInstance(): classNotFoundException throw when class is not found/available.
        //new operater: noClassDefFoundError throw when class is not found/available.
        //Object o = Class.forName("String").newInstance();
        //InstanceOf operater is use to check wether a object is of a particular object type.
        int x = 10;
        long y = x;//implicit typecasting(Small to long)
        //No lost of Information in Implicit 
        int z = (int)y;//Explicit typecasting(long to small)
        //Lost of Information in Explicit
        InstanceOf io = new InstanceOf();
        System.out.println(io instanceof InstanceOf);//Syntax: Object_name instanceof class_name
        InstanceOf in = null;
        System.out.println(in instanceof InstanceOf); 
        Dog d = new Dog();
        System.out.println(d instanceof Animal);
    }
}
class Animal{

}
class Dog extends Animal{//extends is use for perform inheritance here dog is child class 
    //and parent is parent class
    
}
