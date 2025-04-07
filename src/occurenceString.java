import java.util.Scanner;

public class occurenceString {

    /* public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        int count = 0;

        String name = sc.next();

        char[] a = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {

            char c = a[i];


            char k = a[i];
            if (k == c) {
                count++;
                System.out.println(k);
            }
        }

    }*/

    public static void countCharacterOccurrence(String str) {
        int[] count = new int[256]; // ASCII character frequency array

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            count[c]++;
        }

        // Print occurrences
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " -> " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        countCharacterOccurrence(str);
    }
}
