package Assignment;
import java.util.Scanner;
public class Practise3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        int currentYear = java.time.Year.now().getValue();
        // int yearsToHundred = 100 - age;
        int yearOfBirth = currentYear - age;
        System.out.println(name);
        System.out.println(yearOfBirth + 100);
        sc.close();
    }
}
