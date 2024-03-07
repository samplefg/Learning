import java.util.Scanner;
public class Practise9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        try{
            int input = Integer.valueOf(inputString);
            System.out.println(input);
        }catch(Exception e){
            System.out.println("Not a number");

        }
        
    }
}
