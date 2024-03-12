package JAVAPractise;

public class MainMethodTest {
    public static void main(String[]args){
        System.out.println("String");//jvm always call the main() that contain String[].
        //We can override the main().  
    }
    public static void main(int[]args){
        System.out.println("integer");
    }
}
