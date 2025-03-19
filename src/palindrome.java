import java.util.Scanner;

public class palindrome {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int value = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (rev == value) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
