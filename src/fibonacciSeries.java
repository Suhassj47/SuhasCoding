import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of fibonacci series");
        int count = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        System.out.print(num1 + " " + num2);
        for (int i = 2; i < count; i++) {
            sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
