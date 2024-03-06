package Assignment;
import java.util.Scanner;
public class Practise1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double principleAmount = sc.nextDouble();
        double interestRate = sc.nextDouble();
        int numberOfYears = sc.nextInt();
        double interestRateDecimal = interestRate / 100; 
        double futureValue = principleAmount * Math.pow(1 + interestRateDecimal, numberOfYears);
        System.out.println(futureValue);
        sc.close();
    }
}
