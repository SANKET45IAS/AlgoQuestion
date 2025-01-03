package P4;

import java.util.*;

public class insSort {
    
    private static void insertionSort(int[]a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }    
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sa.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) a[i] = sa.nextInt();

        insertionSort(a);
        System.out.print("Sorted array:");
        System.out.print(Arrays.toString(a));
    }
}

