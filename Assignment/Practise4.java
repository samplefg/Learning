
public class Practise4 {
    public static void main(String[]args){
        double principleAmount = 400;
        double interestRate = 10;
        int numberOfYears = 8;
        double interestRateDecimal = interestRate / 100;
        double futureValue = principleAmount * Math.pow(1 + interestRateDecimal, numberOfYears);
        System.out.println(futureValue);
    }
}
