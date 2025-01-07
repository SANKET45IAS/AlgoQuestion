package AAAAAAAAAA;

import java.util.Arrays;

public class MaxMinSeq {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int n = arr.length;
        int[] result = maxMin(arr, n);
        System.out.print("Rearranged array:");
        System.out.print(Arrays.toString(result));
    }

    private static int[] maxMin(int[] arr, int n) {
        int[] result = new int[n];
        int l = 0, r = n - 1, i = 0;

        while (l <= r) {
            if (i % 2 == 0) result[i++] = arr[r--];
            else result[i++] = arr[l++];
        }
        return result;
    } 
    
}