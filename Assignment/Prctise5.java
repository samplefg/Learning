import java.util.Scanner;
public class Prctise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputNumber = sc.nextDouble();
        double difference = Math.abs(inputNumber - 17);
        if (inputNumber > 17) {
            difference *= 2;
        }
        System.out.println(difference);
        sc.close();
    }
}


