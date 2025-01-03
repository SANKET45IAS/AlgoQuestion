package P2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sa.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = sa.nextInt();
        int maxSum = SumSubarray(arr);
        System.out.println("Largest sum of contiguous subarray: " + maxSum);
    }
    private static int SumSubarray(int[] arr) {
        int maxC = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxC = Math.max(arr[i], maxC + arr[i]);
            if (maxC > max) max = maxC;
        }
        return max;
    }   
}
