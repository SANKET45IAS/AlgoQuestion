package P2;

import java.util.Scanner;

public class Q4 {
    private static long Fact(int n) {
        long factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *= i;
        }
        return factorial;
    }  
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sa.nextInt();

        long result = Fact(num);
        System.out.println("Factorial of " + num + " is: " + result);

    }
}

