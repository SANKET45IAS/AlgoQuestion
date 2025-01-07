package AAAAAAAAAA;

public class SubAray {

    public static int findLargestSumSubarray(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int largestSum = findLargestSumSubarray(arr);

        System.out.println("The largest sum of a contiguous subarray is: " + largestSum);
    }    
}
