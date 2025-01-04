package P5;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sa.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = sa.nextInt();
        int[] reducedArray = reduceArray(arr);
        System.out.print("Reduced and sorted array:");
        System.out.println(Arrays.toString(reducedArray));
    }

    private static int[] reduceArray(int[] arr) {
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                temp[j++] = arr[i];
            }
        }
        return Arrays.copyOf(temp, j); 
    }
}