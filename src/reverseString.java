import java.util.Scanner;

public class reverseString {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = sc.next();
        String rev = "";

       /* for (int i = name.length() - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);
        }


        */

        char[] a = name.toCharArray();
        for (int i = name.length() - 1; i >= 0; i--) {

            rev = rev+a[i];
        }
        System.out.println("Reversed string is "+rev);

    }
}
