import java.util.Scanner;

public class Practise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        if (inputNumber % 2 == 0) {
            System.out.println("inputNumber is an even");
        } else {
            System.out.println("inputNumber is an odd");
        }
        sc.close();
    }
}
