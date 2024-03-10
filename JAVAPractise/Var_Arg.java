package JAVAPractise;

public class Var_Arg {
    public static void main(String[]args){
        Var_Arg va = new Var_Arg();
        va.fun(100);//One value argument
        va.fun(3, 4, 5, 6, 7);//Multi_value argument
        va.fun();//no value argument
    }
    public void fun(int... x){//If their is a method with various no. of argument of similar
        //data type then we can use VAR-arg concept.
        //Syntax of Var-arg = function_name(data_type... variable_name);.
        //The Var_arg get converted into 1-D array. The array will of same type of Var_arg type.
        //Var-arg should be the last parameter in of method declaration.
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);//To print an array we need to traverse a cross the
            //array to reach the position.
            //To traverse we can use for_loop and while_loop after we reached the position to
            //print the value of that position(index) we use array_name[position].
        }

    }
}
