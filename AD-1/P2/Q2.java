package P2;

import java.util.Scanner;

public class Q2 {
 
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sa.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = sa.nextInt();

        int missingNumber = SMN(arr, n);
        System.out.println("Smallest positive missing number: " + missingNumber);
    }
    private static int SMN(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return n + 1;
    }   
}

