package AAAAAAAAAA;

import java.util.Arrays;

public class CheckRev {
    
    public static boolean SubArray(int a[]) {
        int[] sortedArray = a.clone();
        Arrays.sort(sortedArray);
        boolean result = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int[] afterRev = rev(a.clone(), i, j);
                if (arraysEqual(sortedArray, afterRev)) {
                    result = true;
                    break;
                }
            }
            if (result) break;
        }

        return result;
    }

    public static int[] rev(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3, 6};

        if (SubArray(arr)) {
            System.out.println("Yes, the array can be sorted by reversing a subarray.");
        } else {
            System.out.println("No, the array cannot be sorted by reversing a subarray.");
        }
    }
}
