package LeetCode;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Range (n): ");
        int n = scanner.nextInt();

        int a[] = new int[n - 1];
        int sum = 0;

        System.out.println("Enter " + (n - 1) + " array elements between 1 and " + n + " with one number missing:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            sum += a[i]; // Add each entered element to the sum
        }

        // Calculate the sum of first n natural numbers
        int totalSum = (n * (n + 1)) / 2;

        // Missing number is the difference between the total sum and the entered sum
        System.out.println("The missing number is: " + (totalSum - sum));

        scanner.close(); // Close the scanner to release resources
    }
}
