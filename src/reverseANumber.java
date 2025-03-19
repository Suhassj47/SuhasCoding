import java.util.Scanner;

public class reverseANumber {

    public static void main(String args[]) {

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        StringBuffer sb = new StringBuffer(String.valueOf(number));
        StringBuffer rev = sb.reverse();
        System.out.println("Reverse number is "+rev);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int rev = 0;

      /*    int rev = 0;
      while (number != 0) {
            rev = rev * 10 + number % 10;//4
            number = number / 10;
        }*/

        while (number != 0) {
            rev = rev*10 + number%10;
            number = number/10;
        }

        System.out.println("The reversed value is " + rev);

    }
}
