package P1;
import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
    Scanner sa=new Scanner(System.in);
    System.out.print("Enter a No:");
    int n=sa.nextInt();
    System.out.println("Sum of n number:"+(n*(n+1)/2));
}
}