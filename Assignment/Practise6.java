import java.util.Scanner;
public class Practise6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double sum = num1 + num2 + num3;
        if (num1 == num2 && num2 == num3) {
            sum *= 3;
        }
        System.out.println(sum);
        scanner.close();
    }
}


