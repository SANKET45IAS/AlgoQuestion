package P2;
import java.util.*;
public class Q3 {
  
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sa.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = sa.nextInt();

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
