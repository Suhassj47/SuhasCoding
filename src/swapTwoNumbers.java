import java.util.Scanner;

public class swapTwoNumbers {

    public static void main(String args[]) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Before swapping enter the value of a");
        int a = sc1.nextInt();
        System.out.println("Before swapping enter the value of b");
        int b = sc1.nextInt();
        //Method 1
      /* a = a + b;
        b = a - b;
        a = a - b;*/

        //Method 2
        int t;
        t=a;
        a=b;
        b=t;

        System.out.println("After swapping " + "value of a is " + a + " value of b is " + b);
    }

}
