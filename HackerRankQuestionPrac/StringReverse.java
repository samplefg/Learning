package HackerRankQuestionPrac;

import java.util.Scanner;

public class StringReverse {
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer str = new StringBuffer(A);
        StringBuffer reverse  = str.reverse();
        System.out.println(A + " " + reverse);
        if(A.equals(reverse.toString())){
            System.out.println("Yes");
        }else{
        System.out.println("No");
        }
    }
}





