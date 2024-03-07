import java.util.Scanner;
public class Practise6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double sum = num1 + num2 + num3;
        if (num1 == num2 && num2 == num3) {
            sum *= 3;
        }
        System.out.println(sum);
        sc.close();
    }
}


