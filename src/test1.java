import java.util.Scanner;

public class test1 {

    public static void main(String args[]) {

          /* // Swap two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num;

        num = num1;
        num1 = num2;
        num2 = num;

        System.out.println("First number is "+num1);
        System.out.println("Second number is "+num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping " +num1 +" "+ num2 );*/

        //Reverse number

     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int rev = 0;

        while (num!=0){

            rev = rev * 10 + num%10;
            num = num/10;
//Suhas SJ
        }
        System.out.println(rev);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println(rev);
        //

    }
}
