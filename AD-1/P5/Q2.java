package P5;
import java.util.*;
public class Q2 {
    private static int[] ms(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) merged[k++] = arr1[i++];
            else merged[k++] = arr2[j++];
        }
        while (i < n1) merged[k++] = arr1[i++];
        while (j < n2) merged[k++] = arr2[j++];
        return merged;
    }  
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n1 = sa.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first sorted array:");
        for (int i = 0; i < n1; i++) arr1[i] = sa.nextInt();
        System.out.print("Enter the size of the second array: ");
        int n2 = sa.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second sorted array:");
        for (int i = 0; i < n2; i++) arr2[i] = sa.nextInt();

        int[] mergedArray = ms(arr1, arr2);
        System.out.println("Merged sorted array:");
        for (int num : mergedArray) System.out.print(num + " ");
    }

    
}

