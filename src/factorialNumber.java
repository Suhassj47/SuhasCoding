import java.util.Scanner;

public class factorialNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for Factorial");
        int num = sc.nextInt();
        int total = 1;

      /*  for (int i = 1; i <= num; i++) {

            total = total + (num * i);

        }*/
        // int text = num;
    /*    for(int i=num-1; i>=1; i--){

            total = num*i;
            num = total;
        }*/

        for (int i = 1; i <= num; i++) {

            total = total * i;
           // num = total;
        }

        System.out.println(total);
    }
}
