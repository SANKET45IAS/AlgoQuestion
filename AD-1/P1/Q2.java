package P1;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sa= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sa.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = sa.nextInt();
        int max = arr[0], min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
