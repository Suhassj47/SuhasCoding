import java.util.Scanner;

public class countNumberEvenOddDigitsinANumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int countEven = 0;
        int countOdd = 0;
        while (number > 0) {
            int rem = number % 10;
            if (rem % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            number = number / 10;
        }
        System.out.println("Even number count is " + countEven);
        System.out.println("Odd number count is " + countOdd);
    }
}
