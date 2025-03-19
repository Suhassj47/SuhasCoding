import java.util.Scanner;

public class palindromeString {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = sc.next();
        String word = "";
        word = name;
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }

        if (word.equals(rev)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

    }
}
