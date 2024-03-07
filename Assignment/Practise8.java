import java.util.Scanner;

public class Practise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputAlphabet = sc.next().charAt(0);
        inputAlphabet = Character.toLowerCase(inputAlphabet);
            if (inputAlphabet == 'a' || inputAlphabet == 'e' || inputAlphabet == 'i' ||
                inputAlphabet == 'o' || inputAlphabet == 'u') {
                System.out.println("inputAlphabet is a vowel");
            } else {
                System.out.println("inputAlphabet is a consonant");
            }
            sc.close();
    }
}

