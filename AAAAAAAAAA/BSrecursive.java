package AAAAAAAAAA;

import java.util.Arrays;

public class BSrecursive {
    static int binarySearch(int a[], int l, int r, int k) {
        if (l > r) {
            return -1; // Base case: Element not found
        }

        int mid = (l + r) / 2; // Calculate mid
        if (a[mid] == k) {
            return mid; // Element found
        } else if (a[mid] < k) {
            return binarySearch(a, mid + 1, r, k); // Search in the right half
        } else {
            return binarySearch(a, l, mid - 1, k); // Search in the left half
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 1, 7, 4, 5, 9, 8};
        Arrays.sort(a); // Sort the array
        int key = 8;
        int index = binarySearch(a, 0, a.length - 1, key); // Call recursive function
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }   
}
