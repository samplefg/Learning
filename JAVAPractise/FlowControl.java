package JAVAPractise;

public class FlowControl {
    public static void main(String[]args){
        // if(9 < 10)
        // int x = 10;//compile time errer as single line statement can not be 
        //used a declear a variable.
        int x = 10; 
        switch(x){//x can be byte, short, char, int
           // Rapper class(Byte, Short, Character, Integer, enum) alowed from 1.5 version.
           //From version 1.7 we can allowed string type also.
           //Boolean can have only two case where as long can have a very large no. of cases
           //as range of long is -2^63 to 2^63-1 and decimal can have infanite no of cases 
           //between to decimal point
           case 5:System.out.println("5");
           // Every case most have constant expression not a variable.
           //Duplicate case label not allowed. 
           break;
           case 10:System.out.println("10");
           break;
           default:System.out.println("default");
           break;
        }
    }
}
