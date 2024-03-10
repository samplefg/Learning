package JAVAPractise;

public class GetterSetter {
    public static void main(String[]arg){
        Ashwinichasmis ac = new Ashwinichasmis();
        ac.setAbhishekChasmis(23);
        int x = ac.getAbhishekChashmis();//As our method is returning integer type value
        //so to store the return value we have created a variable x of type integer.
        //Similar to this whenever a function is returning value of any data type we
        //will store the return value in the variable similar to the return type of 
        //that function.
        System.out.println(x);

    }
}
class Ashwinichasmis{
    private int abhishekchasmis;//For accessing private variable we need getter and setter
    //get abd set are the prefix used for the method_name used to access private variable.
    public void setAbhishekChasmis(int x){//to set a value to a private variable we use set method. 
        this.abhishekchasmis = x;
    }
    public int getAbhishekChashmis(){//To get a value of private variable we use get method. 
        return abhishekchasmis;
    }
}
