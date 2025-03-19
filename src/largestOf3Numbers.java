import java.util.Scanner;

public class largestOf3Numbers {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        /*if (number1 > number2) {
            System.out.println("1st number is the largest");
        } else if (number2 > number3) {
            System.out.println("2nd number is the largest");
        } else
            System.out.println("3rd number is the largest");*/

        // Method 2 - Using Ternary operator

        int largest1 = number1 > number2 ? number1 : number2;
        int largest = largest1 > number3 ? largest1 : number3;
        System.out.println("The largest number is " + largest);

    }
}

