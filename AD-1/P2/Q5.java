package P2;

import java.util.Scanner;

public class Q5 {
    private static int Fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }    
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sa.nextInt();
        int fibonacciNumber = Fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
    }

}
