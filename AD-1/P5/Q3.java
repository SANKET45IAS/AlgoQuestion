package P5;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sa.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) a[i] = sa.nextInt();

        boolean isReverseSorted = isReverse(a);
        System.out.println("Is the array sorted in reverse order? " + isReverseSorted);
    }
    private static boolean isReverse(int[]a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) return false;
        }
        return true;
    }  
}


