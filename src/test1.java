import java.util.Scanner;

public class test1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many fib numbers required");

        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = 1;
        System.out.print(num1+" "+num2);

        for (int i = 2; i < num; i++) {
            sum = num1 + num2;
            System.out.print(" "+sum);
            num1 = num2;
            num2 = sum;
        }


    }
}
