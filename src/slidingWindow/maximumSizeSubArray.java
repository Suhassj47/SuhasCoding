package slidingWindow;

public class maximumSizeSubArray {
    // Maximum Sum Subarray of Size K
    //   Given an array of integers and a number k, find the maximum sum of a subarray of size k.
    //    Example: arr = [2, 1, 5, 1, 3, 2], k = 3 ➝ Output: 9

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of the sub array of size " + k + " is: " + maximumSize(arr, k));


    }

    public static int maximumSize(int[] arr, int k) {

        if (arr.length < k) {
            System.out.println("Array size must be atleast k");
        }
        int windowSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }


        return maxSum;
    }
    // Suhas


}
