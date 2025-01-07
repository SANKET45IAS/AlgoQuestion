package AAAAAAAAAA;

import java.util.Arrays;

public class BinarySearch {
    static int BS(int a[], int k) {
        Arrays.sort(a); // Sort the array
        int l = 0;
        int r = a.length - 1;

        while (l <= r) { // Correct condition for binary search
            int mid = (l + r) / 2; // Calculate mid inside the loop
            if (a[mid] == k) {
                return mid; // Element found
            } else if (a[mid] < k) {
                l = mid + 1; // Search in the right half
            } else {
                r = mid - 1; // Search in the left half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int a[] = {2, 1, 7, 4, 5, 9, 8};
        int key = 8;
        int index = BS(a, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
