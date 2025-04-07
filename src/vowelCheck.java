import javax.swing.*;
import java.util.Scanner;

public class vowelCheck {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name");

        String name = sc.next();
        boolean hasVowel = false;


        char[] chars = name.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];


            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowel = true;
                break;
            }
        }

        if (hasVowel) {
            System.out.println("Name contains vowel");
        } else
            System.out.println("Name doesn't contain vowel");
    }
}



    /* public static void main(String[] args) {
        String input = "suhas"; // Example input
        boolean hasVowel = false;

        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowel = true;
                break; // No need to check further
            }
        }

        if (hasVowel) {
            System.out.println("Vowel is present.");
        } else {
            System.out.println("No vowel found.");
        }
    }


}*/





