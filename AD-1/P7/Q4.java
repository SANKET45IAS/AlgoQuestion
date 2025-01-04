package P7;
import java.util.*;
public class Q4 {
    public static void findMinMaxDiffPairs(int[] arr) {
        Arrays.sort(arr);
        int minD = Integer.MAX_VALUE;
        int maxD = Integer.MIN_VALUE;
        int[] minP = new int[2];
        int[] maxP = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < minD) {
                minD = diff;
                minP[0] = arr[i];
                minP[1] = arr[i + 1];
            }
            if (diff > maxD) {
                maxD = arr[arr.length - 1] - arr[0];
                maxP[0] = arr[0];
                maxP[1] = arr[arr.length - 1];
            }
        }
        System.out.println("Minimum Difference Pair: (" + minP[0] + ", " + minP[1] + ")");
        System.out.println("Maximum Difference Pair: (" + maxP[0] + ", " + maxP[1] + ")");
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 1, 9};
        findMinMaxDiffPairs(arr);
    }    
}

